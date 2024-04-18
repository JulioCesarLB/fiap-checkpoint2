package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="profissionais")
public class Profissional {

	@Id
	private long id;
	
	@Column
	private String nome;
	
	@Column
	private String especialidade;
	
	@Column
	private double valorHora;
	
	@Column
	private LocalDate createdAt;
	
	@Column
	private LocalDate updatedAt;
	
}
