package com.devsuperior.dsmovie.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.ScorePK;

/*Realiza operações para buscar/salvar/deletar e inserir  */
public interface ScoreRepository extends JpaRepository<Score,ScorePK>{

	
	
}
