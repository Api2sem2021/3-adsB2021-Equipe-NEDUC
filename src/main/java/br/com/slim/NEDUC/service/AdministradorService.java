package br.com.slim.NEDUC.service;

import br.com.slim.NEDUC.model.entity.Administrador;

public interface AdministradorService {

	Administrador autenticar_adm(String email, String senha);
	
	Administrador salvar_aluno(Administrador aluno);
	
	Administrador salvar_professor(Administrador adm);
	
	void validaremail_adm(String email);
	
	void validaremail_aluno(String email);
	
	void validaremail_professor(String email);

	


}
