package br.com.slim.NEDUC.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.slim.NEDUC.model.entity.professor;

public interface ProfessorRepository extends JpaRepository<professor, Long>{

	//Metodo de Query 
	Optional<professor> findByemail(String email);
	
	//boolean
	boolean existsByemail(String email);
}
