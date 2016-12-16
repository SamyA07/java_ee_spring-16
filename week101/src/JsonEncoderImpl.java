public class JsonEncoderImpl implements api.week1.JsonEncoder {

    public String toJson(String str){
	return "\"" + str.replace("\\","\\\\").replace("\"","\\\"") + "\"";
    }

    public String toJson(Number n){
	Double d = new Double(n.doubleValue());
	return d.toString();
    }

    public String toJson(java.util.Map map){
	String ret = "{";
	boolean first = true;
	for(Object key : map.keySet()) {
	    if (!first) {
		ret += ",";
	    }
	    else {
		first = false;
	    }

	    Object value = map.get(key);
	    
	    // TODO: change this implementation.
	    if (value instanceof String) {
		ret += "\"" + key + "\": \"" + value + "\"";
	    }
	    else {
		ret += "\"" + key + "\": " + toJson((Number) value);
	    }
	}
	return ret + "}";
    }

    public static void main(String args[]){
	JsonEncoderImpl enc = new JsonEncoderImpl();
	System.out.println(enc.toJson(12d));
    }
}
