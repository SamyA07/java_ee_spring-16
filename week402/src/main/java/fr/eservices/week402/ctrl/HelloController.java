package fr.eservices.week402.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/hello")
public class HelloController {
	
	@RequestMapping(value="/world")
	public String sayHello(Model model,@RequestParam(value = "name", defaultValue ="samy") final String name) {
		model.addAttribute("message", "Hello " + name + " !");
		return "sample";
	}
}
