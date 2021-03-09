package br.com.slim.NEDUC.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProfessorDto {

	private String email;
	private String nome;
	private String senha;
}
