package br.com.slim.NEDUC.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.slim.NEDUC.api.dto.AlunoDto;
import br.com.slim.NEDUC.exception.RegraNegocioException;
import br.com.slim.NEDUC.model.entity.aluno;
import br.com.slim.NEDUC.service.AlunoService;

@RestController
@RequestMapping("/api/alunos")
public class AlunoResource {
		
private AlunoService service;
	
	public AlunoResource( AlunoService service ) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity salvar( @RequestBody AlunoDto dto) {
	
		aluno Aluno = aluno.builder()
				.nome(dto.getNome())
				.email(dto.getEmail())
				.senha(dto.getSenha()).build();
		try {
			aluno alunosalvo = service.salvar_aluno(Aluno);
			return new ResponseEntity(alunosalvo, HttpStatus.CREATED);
			}catch (RegraNegocioException e) {
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		
	}
}
