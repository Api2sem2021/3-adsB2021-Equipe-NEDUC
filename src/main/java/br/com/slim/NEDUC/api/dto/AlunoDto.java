package br.com.slim.NEDUC.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AlunoDto {


	private String nome;
	private String celular;
	private String nascimento;
	private String genero;
	private String senha;
	private String email;
}
