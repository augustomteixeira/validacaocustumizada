package com.augustomteixeira.validacaocustumizada.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.augustomteixeira.validacaocustumizada.repository.CampoEntretenimentoObrigatoriedadeRepository;

@Service
public class CampoEntretenimentoObrigatoriedadeService {
	
	@Autowired
	private CampoEntretenimentoObrigatoriedadeRepository campoEntretenimentoObrigatoriedadeRepository;

	public Map<String, Boolean> campoObrigatorioPorTipoEntretenimento(Integer idTipoEntretenimento) {
		List<Object[]> camposEncontrados = campoEntretenimentoObrigatoriedadeRepository
				.campoObrigatorioPorTipoEntretenimento(idTipoEntretenimento);

		Map<String, Boolean> campos = new HashMap<String, Boolean>();
		for (Object[] campoEncontrado : camposEncontrados) {
			String nomeCampo = (String) campoEncontrado[0];
			Boolean obrigatorio = (Boolean) campoEncontrado[1];
			campos.put(nomeCampo, obrigatorio);
		}

		return campos;
	}
	
}
