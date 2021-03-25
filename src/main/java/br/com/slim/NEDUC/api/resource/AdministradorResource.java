package br.com.slim.NEDUC.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.slim.NEDUC.api.dto.AdministradorDto;
import br.com.slim.NEDUC.api.dto.AlunoDto;
import br.com.slim.NEDUC.exception.ErroAutenticacao;
import br.com.slim.NEDUC.exception.RegraNegocioException;
import br.com.slim.NEDUC.model.entity.Administrador;
import br.com.slim.NEDUC.service.AdministradorService;

	@RestController
	@RequestMapping("/api/adm")
	public class AdministradorResource {
			
		private AdministradorService service;
		
		
		public AdministradorResource( AdministradorService service ) {
			this.service = service;
		}
		
		@GetMapping("/index")
		public String helloaluno() {
			return "Index";
		}
		
		@SuppressWarnings({ "rawtypes" })
		@PostMapping("/login")
		public ResponseEntity autenticar(@RequestBody AlunoDto dto) {
			
			try {
				Administrador adm_autenticado = service.autenticar_adm(dto.getEmail(), dto.getSenha());
				return ResponseEntity.ok(adm_autenticado);
			}catch (ErroAutenticacao e) {
				return ResponseEntity.badRequest().body(e.getMessage());
			}
			
		}
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		@PostMapping("/salvaraluno")
		public ResponseEntity salvar_aluno( @RequestBody AdministradorDto dto) {
		
			Administrador adm = Administrador.builder()
					.nome(dto.getNome())
					.email(dto.getEmail())
					.senha(dto.getSenha()).build();
			try {
				Administrador alunosalvo = service.salvar_aluno(adm);
				return new ResponseEntity(alunosalvo, HttpStatus.CREATED);
				}catch (RegraNegocioException e) {
					return ResponseEntity.badRequest().body(e.getMessage());
				}
			
		}
}
