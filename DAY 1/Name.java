package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
		private String StudentName="IamNeo";
		@RequestMapping("/name")
		public String name()
		{
			return "Welcome "+StudentName+"!";
		}

	

}
