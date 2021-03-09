package com.augustomteixeira.validacaocustumizada.model.list;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_entretenimento", schema = "listas")
public class TipoEntretenimento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoEntretenimento;
	
	private String descricao;

	public Integer getIdTipoEntretenimento() {
		return idTipoEntretenimento;
	}

	public void setIdTipoEntretenimento(Integer idTipoEntretenimento) {
		this.idTipoEntretenimento = idTipoEntretenimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
	
	
	
}
