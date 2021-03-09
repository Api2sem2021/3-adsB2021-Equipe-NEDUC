package br.com.slim.NEDUC.service;

import br.com.slim.NEDUC.model.entity.professor;

public interface ProfessorService {

	professor autenticar_professor(String email, String senha);
	
	professor salvar_professor(professor Professor);
	
	void validaremail_professor(String email);
}
