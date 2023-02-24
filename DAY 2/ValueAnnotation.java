package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation {
	@Value("${welcome.message}")
	private String message;
    @RequestMapping("/value")
    public String value()
    {
    	return message;
    }

}
