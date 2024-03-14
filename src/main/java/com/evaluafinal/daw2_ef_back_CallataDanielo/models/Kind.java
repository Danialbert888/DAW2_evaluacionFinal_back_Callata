package com.evaluafinal.daw2_ef_back_CallataDanielo.models;

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
public class Kind {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idKind;
	
	private String nameString;

}
