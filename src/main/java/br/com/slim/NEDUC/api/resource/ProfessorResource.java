package br.com.slim.NEDUC.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.slim.NEDUC.api.dto.ProfessorDto;
import br.com.slim.NEDUC.exception.RegraNegocioException;
import br.com.slim.NEDUC.model.entity.professor;
import br.com.slim.NEDUC.service.ProfessorService;

@RestController
@RequestMapping("/api/professores")
public class ProfessorResource {
	
	private ProfessorService service;
	
	public ProfessorResource( ProfessorService service ) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity salvar( @RequestBody ProfessorDto dto) {
	
		professor Professor = professor.builder()
				.nome(dto.getNome())
				.email(dto.getEmail())
				.senha(dto.getSenha()).build();
		try {
			professor professorsalvo = service.salvar_professor(Professor);
			return new ResponseEntity(professorsalvo, HttpStatus.CREATED);
			}catch (RegraNegocioException e) {
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		
	}
}
