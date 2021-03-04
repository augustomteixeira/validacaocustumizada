package com.augustomteixeira.validacaocustumizada.model.list;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_passa_tempo", schema = "listas")
public class TipoPassaTempo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoPassaTempo;
	
	private String descricao;

	public Integer getIdTipoPassaTempo() {
		return idTipoPassaTempo;
	}

	public void setIdTipoPassaTempo(Integer idTipoPassaTempo) {
		this.idTipoPassaTempo = idTipoPassaTempo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
