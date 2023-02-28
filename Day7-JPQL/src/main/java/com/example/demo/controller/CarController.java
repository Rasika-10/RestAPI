package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;

@RestController
public class CarController {
	
	@Autowired
	CarRepository repository;
	
	@PostMapping("/car")
	public boolean addCar(@RequestBody Car car)
	{
	    repository.save(car);
		return true;
	}
	
	@GetMapping("/car")
	public List<Car> read()
	{
		return repository.findAll();
	}
	
	@GetMapping("/owners/{owners}")
	public List<Car> getByOwners(@PathVariable int owners)
	{
		return repository.findByOwners(owners);
	}
	
	@GetMapping("/address/{address}")
	public List<Car> getByAddress(@PathVariable String address)
	{
		return repository.findByAddress(address);
	}
	
	@GetMapping("/carName/{carName}")
	public List<Car> getByOwner(@PathVariable String carName)
	{
		return repository.findByCarName(carName);
	}
	
	@GetMapping("/owners/{owners}/cartype/{carType}")
	public List<Car> getByOwnersAndCarType(@PathVariable int owners,@PathVariable String carType)
	{
		return repository.findByOwnersAndCarType(owners,carType);
	}
	
	
	


}
