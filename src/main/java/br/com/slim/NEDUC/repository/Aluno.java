package br.com.slim.NEDUC.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.slim.NEDUC.entity.aluno;

public interface Aluno extends JpaRepository<aluno, Long> {

	// Metodo de Query
	Optional<aluno> findByemail(String email);
	
	// boolean
	boolean existsByemail(String email);
} 
