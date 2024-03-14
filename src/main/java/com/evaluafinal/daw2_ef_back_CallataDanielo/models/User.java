package com.evaluafinal.daw2_ef_back_CallataDanielo.models;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	
	private String usernameString;
	
	private String nameString;
	
	private String lastnameString;
	
	private String emailString;
	
	private String passwordString;
	
	private int isActive;
	
	private int kind;
	
	private LocalDate createAtDate;
	
}
