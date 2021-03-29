package com.augustomteixeira.validacaocustumizada.model.dto;

import java.util.Date;
import com.augustomteixeira.validacaocustumizada.model.list.TipoEntretenimento;
import com.augustomteixeira.validacaocustumizada.validacao.annotations.Titulo;

public class EntretenimentoDto {
	
	@Titulo
	private String titulo;

	private String descricao;

	private TipoEntretenimento tipoEntretenimento;

	private Integer capitulos;

	private String autor;

	private Integer temporadas;

	private Integer paginas;

	private Date duracao;

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

	@Override
	public String toString() {
		return "EntretenimentoDto [titulo=" + titulo + ", descricao=" + descricao + ", tipoEntretenimento="
				+ tipoEntretenimento + ", capitulos=" + capitulos + ", autor=" + autor + ", temporadas=" + temporadas
				+ ", paginas=" + paginas + ", duracao=" + duracao + "]";
	}
	
}
