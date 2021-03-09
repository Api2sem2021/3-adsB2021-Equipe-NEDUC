package br.com.slim.NEDUC.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.slim.NEDUC.model.entity.aluno;

public interface AlunoRepository extends JpaRepository<aluno, Long> {

	// Metodo de Query
	Optional<aluno> findByemail(String email);
	
	// boolean
	boolean existsByemail(String email);
} 
