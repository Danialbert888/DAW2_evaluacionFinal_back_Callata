package com.evaluafinal.daw2_ef_back_CallataDanielo.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTicket;
	
	private String titleString;
	
	private String descriptionString;
	
	private LocalDate updatedAtDate;
	
	private LocalDate createAtDate;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "idCategory")
	private Category category;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "idKind")
	private Kind kind;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "idPriority")
	private Priority priority;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "idProject")
	private Project project;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "idStatus")
	private Status status;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "idUser")
	private User user;
}
