package com.example.dsmovie.entities;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="tb_scoree")
public class Score {
	
	
	@EmbeddedId // Para ids de chaves compostas 			
	private ScorePK id = new ScorePK(); // como é chave composta preciso garantir que está instanciada
	private Double  value;
	
	
	public Score() {
		
		
	}


	public ScorePK getId() {
		return id;
	}


	public void setId(ScorePK id) {
		this.id = id;
	}


	public Double getValue() {
		return value;
	}


	public void setValue(Double value) {
		this.value = value;
	}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUser(User user){
		id.setUser(user);
	}
	
	

}
