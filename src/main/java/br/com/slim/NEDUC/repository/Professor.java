package br.com.slim.NEDUC.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.slim.NEDUC.entity.professor;

public interface Professor extends JpaRepository<professor, Long>{

	//Metodo de Query 
	Optional<Professor> findByemail(String email);
	
	//boolean
	boolean existsByemail(String email);
}
