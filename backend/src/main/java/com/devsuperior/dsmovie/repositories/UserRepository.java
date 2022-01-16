package com.devsuperior.dsmovie.repositories;
import org.springframework.data.jpa.repository.JpaRepository; 

import com.devsuperior.dsmovie.entities.User;

/*Realiza operações para buscar/salvar/deletar e inserir  */
public interface UserRepository extends JpaRepository<User,Long>{

	User findByEmail(String email);
	
}
