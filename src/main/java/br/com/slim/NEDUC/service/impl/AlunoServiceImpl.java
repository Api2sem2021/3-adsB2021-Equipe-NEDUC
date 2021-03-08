package br.com.slim.NEDUC.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.slim.NEDUC.entity.aluno;
import br.com.slim.NEDUC.exception.ErroAutenticacao;
import br.com.slim.NEDUC.exception.RegraNegocioException;
import br.com.slim.NEDUC.repository.Aluno;
import br.com.slim.NEDUC.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {

	
	private Aluno repository;
	
	@Autowired
	public AlunoServiceImpl(Aluno repository) {
		super();
		this.repository = repository;
	}

	@Override
	public aluno autenticar_aluno(String email, String senha) {
		
		Optional<aluno> aluno = repository.findByemail(email);
		
		if (!aluno.isPresent()) {
			throw new ErroAutenticacao("Usuário não encontrado. ");
		}
		
		if(!aluno.get().getSenha().equals(senha)) {
			throw new ErroAutenticacao("Senha incorreta.");
		}
		return aluno.get();
	}

	@Override
	public aluno salvar_aluno(aluno Aluno) {
		validaremail_aluno(Aluno.getEmail());
		return repository.save(Aluno);
	}

	@Override
	public void validaremail_aluno(String email) {
		boolean existe = repository.existsByemail(email);
		if(existe) {
			throw new RegraNegocioException("Email já cadastrado com outro usuário");
		}
	}

}
