package com.program.myproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.program.myproject.entities.Usuary;
import com.program.myproject.repositories.UsuaryRepository;

@RestController
@RequestMapping(value="/users")
public class UsuaryController {
	
	@Autowired
	private UsuaryRepository repository;
	
	@GetMapping
	public List<Usuary> findAll(){
		List<Usuary> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Usuary findById(@PathVariable Long id) {
		Usuary result = repository.findById(id).get();
		return result;
		
	}
	
	@PostMapping
	public Usuary insert (@RequestBody Usuary usuary) {
		Usuary result = repository.save(usuary);
		return result;
	}	
}
