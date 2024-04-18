package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pacientes")
public class Paciente {
	
	@Id
	private long id;
	
	@Column
	private String nome;
	
	@Column
	private String endereco;
	
	@Column
	private String bairro;
	
	@Column
	private String email;
	
	@Column
	private String telefoneCompleto;
	
	@Column
	private Date dataNascimento;
	
	@Column
	private LocalDate createdAt;
	
	@Column
	private LocalDate updateAt;
	
	
}
