package com.augustomteixeira.validacaocustumizada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.augustomteixeira.validacaocustumizada.model.list.TipoEntretenimento;
import com.augustomteixeira.validacaocustumizada.repository.TipoEntretenimentoRepository;

@Service
public class TipoEntretenimentoService {
	
	@Autowired
	private TipoEntretenimentoRepository tipoEntretenimentoRepository;
	
	
	public List<TipoEntretenimento> buscarTiposDeEntretenimento() {
		return tipoEntretenimentoRepository.buscarTiposDeEntretenimento();
	}
	
}
