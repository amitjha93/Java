package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
@RequestMapping(value="/test123",method = RequestMethod.GET)
public String getTest(@RequestParam int value) {
	if(value==1) {
		System.out.println("Hello");
		throw new OneValueException();
	}
	return "Hello World!";
}
}
