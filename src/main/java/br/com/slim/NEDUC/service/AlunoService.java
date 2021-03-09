package br.com.slim.NEDUC.service;

import br.com.slim.NEDUC.model.entity.aluno;

public interface AlunoService {

	aluno autenticar_aluno(String email, String senha);
	
	aluno salvar_aluno(aluno Aluno);
	
	void validaremail_aluno(String email);
}
