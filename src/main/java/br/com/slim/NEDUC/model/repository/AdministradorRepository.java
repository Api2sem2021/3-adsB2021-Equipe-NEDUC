package br.com.slim.NEDUC.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.slim.NEDUC.model.entity.Administrador;
import br.com.slim.NEDUC.model.entity.aluno;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

	// Metodo de Query
	Optional<Administrador> findByemail(String email);
	
	// boolean
	boolean existsByemail(String email);

	aluno save(aluno aluno);

	


} 