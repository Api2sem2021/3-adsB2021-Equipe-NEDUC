package br.com.slim.NEDUC.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "materias", schema = "public")


public class materias {
	@Id
	@Column(name = "id")
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(name = "nome", length = 40)
	private String nome;
	
	@Column(name = "area", length = 25)
	private String area;
	
	@ManyToOne
	@JoinColumn(name = "id_aluno")
	private aluno aluno;
}
