package com.augustomteixeira.validacaocustumizada.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.augustomteixeira.validacaocustumizada.model.Entretenimento;
import com.augustomteixeira.validacaocustumizada.model.dto.EntretenimentoDto;
import com.augustomteixeira.validacaocustumizada.repository.EntretenimentoRepository;

@Service
public class EntretenimentoService {
	
	@Autowired
	private EntretenimentoRepository entretenimentoRepository;

	public Entretenimento salvar(EntretenimentoDto entretenimentoDto) {
		Entretenimento entretenimento = new Entretenimento();

		if (entretenimentoDto.getTitulo() != null && !entretenimentoDto.getTitulo().isEmpty()) {
			entretenimento.setTitulo(entretenimentoDto.getTitulo());
		}
		
		if (entretenimentoDto.getDescricao() != null && !entretenimentoDto.getDescricao().isEmpty()) {
			entretenimento.setDescricao(entretenimentoDto.getDescricao());
		}
		
		if (entretenimentoDto.getCapitulos() != null) {
			entretenimento.setCapitulos(entretenimentoDto.getCapitulos());
		}
		
		if (entretenimentoDto.getAutor() != null && !entretenimentoDto.getAutor().isEmpty()) {
			entretenimento.setAutor(entretenimentoDto.getAutor());
		}
		
		if (entretenimentoDto.getTemporadas() != null) {
			entretenimento.setTemporadas(entretenimentoDto.getTemporadas());
		}
		
		if (entretenimentoDto.getPaginas() != null) {
			entretenimento.setPaginas(entretenimentoDto.getPaginas());
		}
		
		if (entretenimentoDto.getDuracao() != null) {
			entretenimento.setDuracao(entretenimentoDto.getDuracao());
		}
		
		if (entretenimentoDto.getTipoEntretenimento() != null) {
			entretenimento.setTipoEntretenimento(entretenimentoDto.getTipoEntretenimento());
		}

		return entretenimentoRepository.save(entretenimento);
	}

}
