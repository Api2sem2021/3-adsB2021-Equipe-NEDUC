package br.com.slim.NEDUC.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.slim.NEDUC.model.entity.Gestor;

public interface GestorRepository extends JpaRepository<Gestor, Long> {

	// Metodo de Query
	Optional<Gestor> findByemail(String email);
	
	// boolean
	boolean existsByemail(String email);
}