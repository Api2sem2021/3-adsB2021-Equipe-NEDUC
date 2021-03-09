package br.com.slim.NEDUC.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.slim.NEDUC.exception.ErroAutenticacao;
import br.com.slim.NEDUC.exception.RegraNegocioException;
import br.com.slim.NEDUC.model.entity.professor;
import br.com.slim.NEDUC.model.repository.ProfessorRepository;
import br.com.slim.NEDUC.service.ProfessorService;

@Service
public class ProfessorServiceImpl implements ProfessorService {

	private ProfessorRepository repository;
	
	@Autowired
	public ProfessorServiceImpl(ProfessorRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public professor autenticar_professor(String email, String senha) {
		
		Optional<professor> professor = repository.findByemail(email);
		
		if (!professor.isPresent()) {
			throw new ErroAutenticacao("Usuário não encontrado. ");
		}
		
		if(!professor.get().getSenha().equals(senha)) {
			throw new ErroAutenticacao("Senha incorreta.");
		}
		return professor.get();
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
