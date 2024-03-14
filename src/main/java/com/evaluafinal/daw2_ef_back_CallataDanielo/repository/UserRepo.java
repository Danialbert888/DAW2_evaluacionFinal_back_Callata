package com.evaluafinal.daw2_ef_back_CallataDanielo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluafinal.daw2_ef_back_CallataDanielo.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
