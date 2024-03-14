package com.evaluafinal.daw2_ef_back_CallataDanielo.service;

import java.util.List;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.Ticket;
import com.evaluafinal.daw2_ef_back_CallataDanielo.models.User;

public interface UserService {
	
	public List<User> list();
	public User add(User user);
	public User update(User user);
	public void delete(int id);
	public User buscarxid(int id);
//	public Ticket buscarxnombre(String name);


}
