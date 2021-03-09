package com.augustomteixeira.validacaocustumizada.model.list;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "campo_tipo_entretenimento", schema = "listas")
public class CampoTipoEntretenimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCampoTipoEntretenimento;
	
	private String descricao;

	public Integer getIdCampoTipoEntretenimento() {
		return idCampoTipoEntretenimento;
	}

	public void setIdCampoTipoEntretenimento(Integer idCampoTipoEntretenimento) {
		this.idCampoTipoEntretenimento = idCampoTipoEntretenimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
