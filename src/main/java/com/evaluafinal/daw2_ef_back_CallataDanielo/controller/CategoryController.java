package com.evaluafinal.daw2_ef_back_CallataDanielo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Category;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.CategoryService;

@CrossOrigin(value = "http://localhost:4200")
@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@GetMapping("/categorys")
	public List<Category> listar(){
		return service.list();
	}
	
	

}
