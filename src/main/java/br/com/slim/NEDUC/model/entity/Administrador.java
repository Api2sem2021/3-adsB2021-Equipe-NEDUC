package br.com.slim.NEDUC.model.entity;

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
@Table(name = "administrador")
@Builder
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Administrador {
	
	@Id
	@Column(name= "id")
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(name= "nome")
	private String nome;
	
	@Column(name= "celular")
	private String celular;
	
	@Column(name= "nascimento")
	private String nascimento;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "email")
	private String email;
}
