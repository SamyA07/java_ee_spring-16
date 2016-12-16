
import java.sql.*;

import org.sqlite.SQLiteDataSource;

public class App {

	public static void main(String[] args) throws SQLException {
		System.out.println("___ App ___");
		
		SQLiteDataSource ds = new SQLiteDataSource();
		ds.setUrl("jdbc:sqlite:data.db");
		
		Connection conn = ds.getConnection();
		
		// TODO : select all users.
		String request = "SELECT * FROM user";
		ResultSet results = null;
		
		Statement stmt = conn.createStatement();
		results = stmt.executeQuery(request);
		ResultSetMetaData rsmd = results.getMetaData();
		int nbCols = rsmd.getColumnCount();
		while (results.next()) {
		    for (int i = 1; i <= nbCols; i++)
			System.out.print(results.getString(i) + " ");
		    System.out.println();
		}
		results.close();
	}
}
