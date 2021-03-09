package br.com.slim.NEDUC.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "aluno", schema = "public")
@Builder
@Data
public class aluno {

	@Id
	@Column(name = "id")
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(name = "nome", length = 50)
	private String nome;
	
	@Column(name = "email", length = 50)
	private String email;
	
	@Column(name = "celular", length = 11)
	private String celular;
	
	@Column(name = "nascimento")
	private String nascimento;
	
	@Column(name = "genero", length = 9)
	private String genero;
	
	@Column(name = "senha", length = 12)
	private String senha;
}
