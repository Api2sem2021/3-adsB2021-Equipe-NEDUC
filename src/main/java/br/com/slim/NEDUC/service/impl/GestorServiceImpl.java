package br.com.slim.NEDUC.service.impl;

import java.util.Optional;

import br.com.slim.NEDUC.exception.ErroAutenticacao;
import br.com.slim.NEDUC.exception.RegraNegocioException;
import br.com.slim.NEDUC.model.entity.Gestor;
import br.com.slim.NEDUC.model.repository.GestorRepository;
import br.com.slim.NEDUC.service.GestorService;

public class GestorServiceImpl implements GestorService {

	private GestorRepository repository;
	
	public GestorServiceImpl(GestorRepository repository) {
		super();
		this.repository = repository;
	}
	
	
	/* GESTOR */
	
	@Override
	public Gestor autenticar_gestor(String email, String senha) {
		 Optional<Gestor> gestor = repository.findByemail(email);
		 
		 if (gestor.isPresent()) {
			 throw new ErroAutenticacao("Usuário não encotrado. ");
		 }
		 
		 if(!gestor.get().getSenha().equals(senha)) {
			 throw new ErroAutenticacao("Senha incorreta.");
		 }
		return gestor.get();
	}

	/* Administrador */
	
	@Override
	public Gestor salvar_adm(Gestor gestor) {
		validaremail_adm(gestor.getEmail());
		return repository.save(gestor);
	}
	
	@Override
	public void validaremail_adm(String email) {
		boolean existe = repository.existsByemail(email);
		if(existe) {
			throw new RegraNegocioException("Email já cadastrado com outro usuário");
		}
	}

	
	/* ALUNO */
	
	
	@Override
	public Gestor salvar_aluno(Gestor gestor) {
		validaremail_aluno(gestor.getEmail());
		return repository.save(gestor);
	}
	@Override
	public void validaremail_aluno(String email) {
		boolean existe = repository.existsByemail(email);
		if(existe) {
			throw new RegraNegocioException("Email já cadastrado com outro usuário");
		}
	}
	
	
	/* PROFESSOR */
	
	
	@Override
	public Gestor salvar_professor(Gestor gestor) {
		validaremail_professor(gestor.getEmail());
		return repository.save(gestor);
	}

	@Override
	public void validaremail_professor(String email) {
		boolean existe = repository.existsByemail(email);
		if(existe) {
			throw new RegraNegocioException("Email já cadastrado com outro usuário");
		}
	}
}
