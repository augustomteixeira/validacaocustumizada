package com.augustomteixeira.validacaocustumizada.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.augustomteixeira.validacaocustumizada.model.list.TipoEntretenimento;

@Entity
@Table(name = "entretenimento")
public class Entretenimento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEntretenimento;
	
	private String titulo;
	
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "fk_tipo_entretenimento")
	private TipoEntretenimento tipoEntretenimento;
	
	private Integer capitulos;
	
	private String autor;
	
	private Integer temporadas;
	
	private Integer paginas;
	
	private Date duracao;

	public Integer getIdEntretenimento() {
		return idEntretenimento;
	}

	public void setIdEntretenimento(Integer idPassaTempo) {
		this.idEntretenimento = idPassaTempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoEntretenimento getTipoEntretenimento() {
		return tipoEntretenimento;
	}

	public void setTipoEntretenimento(TipoEntretenimento tipoEntretenimento) {
		this.tipoEntretenimento = tipoEntretenimento;
	}

	public Integer getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(Integer capitulos) {
		this.capitulos = capitulos;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Integer temporadas) {
		this.temporadas = temporadas;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public Date getDuracao() {
		return duracao;
	}

	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}
	
}
