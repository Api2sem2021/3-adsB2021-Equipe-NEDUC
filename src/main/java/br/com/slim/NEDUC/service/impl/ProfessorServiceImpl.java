package br.com.slim.NEDUC.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.slim.NEDUC.entity.professor;
import br.com.slim.NEDUC.exception.RegraNegocioException;
import br.com.slim.NEDUC.repository.Professor;
import br.com.slim.NEDUC.service.ProfessorService;

@Service
public class ProfessorServiceImpl implements ProfessorService {

	private Professor repository;
	
	@Autowired
	public ProfessorServiceImpl(Professor repository) {
		super();
		this.repository = repository;
	}

	@Override
	public professor autenticar_professor(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public professor salvar_professor(professor Professor) {
		validaremail_professor(Professor.getEmail());
		return repository.save(Professor);
	}

	@Override
	public void validaremail_professor(String email) {
		boolean existe = repository.existsByemail(email);
		if(existe) {
			throw new RegraNegocioException("Email já cadastrado com outro usuário");}
		
	}

}
