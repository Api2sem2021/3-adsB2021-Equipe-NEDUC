package br.com.slim.NEDUC.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.slim.NEDUC.model.entity.aluno;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AlunoRepositoryTeste {

	@Autowired
	AlunoRepository Repository;
	@Test
	
	public void DeveVerificarAExistenciaDeUmEmail() {
		//cenario
		aluno Aluno = aluno.builder().nome("Victor").email("victor.teste@gmail.com").build();
		Repository.save(Aluno);
		
		//execução
		boolean resultado = Repository.existsByemail(Aluno.getEmail());
		
		//verificação
		Assertions.assertThat(resultado).isTrue();
	}
}
