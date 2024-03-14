package com.evaluafinal.daw2_ef_back_CallataDanielo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.User;
import com.evaluafinal.daw2_ef_back_CallataDanielo.repository.UserRepo;
import com.evaluafinal.daw2_ef_back_CallataDanielo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo repo;

	@Override
	public List<User> list() {
		
		return repo.findAll();
	}

	@Override
	public User add(User user) {
		
		return repo.save(user);
	}

	@Override
	public User update(User user) {
		
		return repo.save(user);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public User buscarxid(int id) {
		
		User user= repo.findById(id).orElse(null);
		
		return user;
	}

}
