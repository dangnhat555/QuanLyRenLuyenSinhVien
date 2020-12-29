package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Result {

	@RequestMapping(value = "/rs", method = RequestMethod.GET)
	public String trangchu( Model model) {
		return "Result";
	}
}
