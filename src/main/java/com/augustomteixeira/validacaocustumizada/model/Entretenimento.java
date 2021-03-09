package com.augustomteixeira.validacaocustumizada.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entretenimento")
public class Entretenimento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEntretenimento;
	
	

	public Integer getIdEntretenimento() {
		return idEntretenimento;
	}

	public void setIdEntretenimento(Integer idPassaTempo) {
		this.idEntretenimento = idPassaTempo;
	}
	
	
	
}
