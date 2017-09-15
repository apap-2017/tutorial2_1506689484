package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PerkalianController {
	
	@RequestMapping("/perkalian")
	public String perkalian(@RequestParam(value = "a", defaultValue = "0") int a,
			@RequestParam(value = "b", defaultValue = "0") int b,
			Model model) {
		int multiply = a * b;
		model.addAttribute("result", Integer.toString(multiply));
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		return "perkalian";
	}
}
