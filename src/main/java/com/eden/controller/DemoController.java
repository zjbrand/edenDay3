package com.eden.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class DemoController {
	
	private static final Logger log = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping("demo")
	public String demo(Model model) {
		log.debug("demo ok");
		String ssString="hello thymeleaf";
		model.addAttribute("msg",ssString);
		return "demo";
	}
	/*
	 * @RequestMapping("login") public String login() { return "login"; }
	 */
}
