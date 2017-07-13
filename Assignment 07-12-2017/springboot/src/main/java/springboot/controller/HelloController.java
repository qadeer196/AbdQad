package springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
	}

}
