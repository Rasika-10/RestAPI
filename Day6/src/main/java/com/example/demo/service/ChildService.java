package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Child;
import com.example.demo.repository.ChildRepository;

@Service
public class ChildService {
	
	@Autowired
	ChildRepository repository;

	public String addChild(Child child) {
		repository.save(child);
		return "Added";
	}

	public List<Child> getChild() {
		return repository.findAll();
	}

	public List<Child> getChildSorted(String field) {
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}

	public List<Child> getChildWithPagination(int offset, int pagesize) {
	    Page<Child> page = repository.findAll(PageRequest.of(offset,pagesize));
		return page.getContent();
	}

	public List<Child> getChildWithPaginationField(int offset, int pagesize, String field) {
		Page<Child>page=repository.findAll(PageRequest.of(offset, pagesize,Sort.by(field)));
		return page.getContent();
	}

}
