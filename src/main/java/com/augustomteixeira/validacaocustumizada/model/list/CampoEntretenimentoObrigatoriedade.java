package com.augustomteixeira.validacaocustumizada.model.list;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "campo_entretenimento_obrigatoriedade", schema = "listas")
public class CampoEntretenimentoObrigatoriedade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCampoEntretenimentoObrigatoriedade;
	
	private Boolean obrigatorio;
	
	@ManyToOne
	@JoinColumn(name = "fk_tipo_entretenimento")
	private TipoEntretenimento tipoEntretenimento;
	
	@ManyToOne
	@JoinColumn(name = "fk_campo_tipo_entretenimento")
	private CampoTipoEntretenimento campoTipoEntretenimento;

	public Integer getIdCampoEntretenimentoObrigatoriedade() {
		return idCampoEntretenimentoObrigatoriedade;
	}

	public void setIdCampoEntretenimentoObrigatoriedade(Integer idCampoEntretenimentoObrigatoriedade) {
		this.idCampoEntretenimentoObrigatoriedade = idCampoEntretenimentoObrigatoriedade;
	}

	public Boolean getObrigatorio() {
		return obrigatorio;
	}

	public void setObrigatorio(Boolean obrigatorio) {
		this.obrigatorio = obrigatorio;
	}
	
	
	
}
