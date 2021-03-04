package com.augustomteixeira.validacaocustumizada.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passa_tempo")
public class PassaTempo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPassaTempo;

	public Integer getIdPassaTempo() {
		return idPassaTempo;
	}

	public void setIdPassaTempo(Integer idPassaTempo) {
		this.idPassaTempo = idPassaTempo;
	}
	
	
	
}
