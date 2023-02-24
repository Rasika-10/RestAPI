package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Child;

public interface ChildRepository extends JpaRepository<Child,Integer> {

	

}
