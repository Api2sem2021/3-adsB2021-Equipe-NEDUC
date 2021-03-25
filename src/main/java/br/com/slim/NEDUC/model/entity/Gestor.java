package br.com.slim.NEDUC.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gestor", schema = "public")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Gestor {

	@Id
	@Column(name= "id")
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(name= "nome")
	private String nome;
	
	@Column(name= "celular")
	private String celular;
	
	@Column(name= "nascimento")
	private Date nascimento;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "email")
	private String email;

}
