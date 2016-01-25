package org.coderearth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("Preparing HomeController !!");
	}

	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public @ResponseBody String greet() {
		return "greeting secured hello\n";
	}

}

