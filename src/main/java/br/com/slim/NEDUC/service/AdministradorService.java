package br.com.slim.NEDUC.service;

import br.com.slim.NEDUC.model.entity.Administrador;
import br.com.slim.NEDUC.model.entity.aluno;
import br.com.slim.NEDUC.model.entity.professor;

public interface AdministradorService {

	Administrador autenticar_adm(String email, String senha);
	
	Administrador salvar_aluno(Administrador Adm);
	
	aluno salvar_aluno(aluno Aluno);
	
	professor salvar_professor(professor Professor);
	
	void validaremail_adm(String email);
}
