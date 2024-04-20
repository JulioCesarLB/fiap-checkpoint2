package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="profissionais")
public class Profissional extends AbstractEntity<Long> {

	
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String especialidade;
	
	@Column(name="valor_hora")
	private double valorHora;
	
	@Column(name="created_at",nullable=false)
	private LocalDateTime  createdAt;
	
	@Column(name="updated_at",nullable=false)
	private LocalDateTime  updatedAt;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	
}
