package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="pacientes")
public class Paciente extends AbstractEntity<Long> {
	
	
	
	@Column(nullable=false)
	private String nome;
	
	@Column
	private String endereco;
	
	@Column
	private String bairro;
	
	@Column
	private String email;
	
	@Column(name ="telefone_completo")
	private String telefoneCompleto;
	
	@Column(name ="data_nascimento", nullable=false)
	private LocalDate dataNascimento;
	
	@Column(name ="created_at", nullable=false)
	private LocalDateTime createdAt;
	
	@Column(name ="updated_at", nullable=false)
	private LocalDateTime updateAt;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneCompleto() {
		return telefoneCompleto;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}

	public void setTelefoneCompleto(String telefoneCompleto) {
		this.telefoneCompleto = telefoneCompleto;
	}

	
}
