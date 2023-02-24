package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Color {
	private String color="Green";
	@RequestMapping("/color")
	public String color()
	{
		return "My Favourite color is "+color+"!";
	}


}
