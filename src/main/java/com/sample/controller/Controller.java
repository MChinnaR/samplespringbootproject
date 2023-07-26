package com.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/entry")
@RestController
public class Controller {

	@GetMapping("/")
	public String home() {
		return "This is home page";

	}

	@GetMapping("/first")
	public String firstMethod() {
		return "This is simple message";

	}

	@GetMapping("/second")
	public String firstMethod(@RequestParam String name) {
		return "This is your name " + name;

	}
}
