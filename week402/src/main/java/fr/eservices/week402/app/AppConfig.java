package fr.eservices.week402.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


// Set this class as a configuration class,
// scan fr.eservices.week402.ctrl for components
// enable spring web mvc
@Configuration
@ComponentScan
@EnableWebMvc
public class AppConfig {

	
	// Add a method to provide an InternalResourceViewResolver,
	// put views in /WEB-INF/views
	// all views would be some jsp

}
