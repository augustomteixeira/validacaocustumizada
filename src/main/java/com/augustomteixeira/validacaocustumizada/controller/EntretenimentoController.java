package com.augustomteixeira.validacaocustumizada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.augustomteixeira.validacaocustumizada.model.list.TipoEntretenimento;
import com.augustomteixeira.validacaocustumizada.service.TipoEntretenimentoService;

@Controller
public class EntretenimentoController {
	
	@Autowired
	private TipoEntretenimentoService tipoEntretenimentoService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView("entretenimento/cadastrar");
		
		List<TipoEntretenimento> tiposDeEntretenimento = tipoEntretenimentoService.buscarTiposDeEntretenimento();
		mv.addObject("tiposDeEntretenimento", tiposDeEntretenimento);
		
		return mv;
	}
	
}
