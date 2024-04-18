package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;

import br.com.fiap.checkpoint2.util.StatusConsulta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="consultas")
public class Consulta {
	
	@Id
	private long id;
	
	@ManyToOne
	@JoinColumn(name="fk_profissional_id")
	private Profissional profissional;
	
	@ManyToOne
	@JoinColumn(name="fk_paciente_id")
	private Paciente paciente;
	
	@Column
	private  LocalDate dataConsulta;
	
	@Column
	@Enumerated(EnumType.STRING)
	private StatusConsulta statusConsulta;
	
	@Column
	private double quantidadeHoras;
	
	@Column
	private double valorConsulta;
}
