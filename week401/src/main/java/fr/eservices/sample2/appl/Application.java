package fr.eservices.sample2.appl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.eservices.sample2.api.Greeter;
import fr.eservices.sample2.api.Printer;
import fr.eservices.sample2.api.Welcome;

@Configuration
@ComponentScan(value="fr.eservices.sample2.impl")
public class Application {
	
	@Autowired
	@Qualifier("swing")
	Welcome welcome;
	@Autowired
	@Qualifier("french")
	Greeter greeter;
	@Autowired
	@Qualifier("console")
	Printer printer;
	

	public Application() {
	}
	
	public void run() {
		String name = welcome.askName();
		String response = greeter.hello(name);
		printer.print( response );
	}
	
	public void setWelcome(Welcome welcome) {
		this.welcome = welcome;
	}
	
	public void setGreeter(Greeter greeter) {
		this.greeter = greeter;
	}
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
		
		Application app = ctx.getBean(Application.class);
		app.run();
	}
}
