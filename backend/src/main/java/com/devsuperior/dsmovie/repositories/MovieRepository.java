package com.devsuperior.dsmovie.repositories;
import com.devsuperior.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/*Realiza operações para buscar/salvar/deletar e inserir  */
public interface MovieRepository extends JpaRepository<Movie,Long>{

	
	
}
