package com.evaluafinal.daw2_ef_back_CallataDanielo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Category;
import com.evaluafinal.daw2_ef_back_CallataDanielo.repository.CategoryRepo;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepo repo;

	@Override
	public List<Category> list() {
		
		return repo.findAll();
	}
	
	

}
