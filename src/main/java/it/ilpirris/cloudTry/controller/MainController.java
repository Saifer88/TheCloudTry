package it.ilpirris.cloudTry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MainController {

	@RequestMapping("/ita")
	public String italianReply()
	{
		return "Ciao";
	}
	
}
