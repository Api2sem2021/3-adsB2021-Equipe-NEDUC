package br.com.slim.NEDUC.service;

import br.com.slim.NEDUC.model.entity.Gestor;

public interface GestorService {
	
	Gestor autenticar_gestor(String email, String senha);
	
	Gestor salvar_adm(Gestor gestor);
	
	Gestor salvar_aluno(Gestor gestor);
	
	Gestor salvar_professor(Gestor gestor);
	
	void validaremail_adm(String email);
	
	void validaremail_aluno(String email);
	
	void validaremail_professor(String email);
}
