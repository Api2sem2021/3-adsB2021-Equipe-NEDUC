package br.com.slim.NEDUC.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.slim.NEDUC.exception.ErroAutenticacao;
import br.com.slim.NEDUC.exception.RegraNegocioException;
import br.com.slim.NEDUC.model.entity.Administrador;
import br.com.slim.NEDUC.model.repository.AdministradorRepository;
import br.com.slim.NEDUC.service.AdministradorService;

@Service
public class AdministradorServiceImpl implements AdministradorService {

	
	private AdministradorRepository repository;
	
	public AdministradorServiceImpl(AdministradorRepository repository) {
		super();
		this.repository = repository;	
	}
	
	/* ADMINISTRADOR */
	
	@Override
	public Administrador autenticar_adm(String email, String senha) {
		
		Optional<Administrador> adm = repository.findByemail(email);
		 
		 if (!adm.isPresent()) {
			 throw new ErroAutenticacao("Usuário não encotrado. ");
		 }
		 
		 if(!adm.get().getSenha().equals(senha)) {
			 throw new ErroAutenticacao("Senha incorreta.");
		 }
		return adm.get();
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
	public Administrador salvar_aluno(Administrador adm) {
		validaremail_aluno(adm.getEmail());
		return repository.save(adm);
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
	public Administrador salvar_professor(Administrador adm) {
		validaremail_professor(adm.getEmail());
		return repository.save(adm);
	}

	
	@Override
	public void validaremail_professor(String email) {
		boolean existe = repository.existsByemail(email);
		if(existe) {
			throw new RegraNegocioException("Email já cadastrado com outro usuário");
		}
		
	}

	


}
