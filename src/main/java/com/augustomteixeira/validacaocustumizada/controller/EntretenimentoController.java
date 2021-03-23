package com.augustomteixeira.validacaocustumizada.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.augustomteixeira.validacaocustumizada.model.list.TipoEntretenimento;
import com.augustomteixeira.validacaocustumizada.service.CampoTipoEntretenimentoService;
import com.augustomteixeira.validacaocustumizada.service.TipoEntretenimentoService;

@Controller
public class EntretenimentoController {
	
	@Autowired
	private TipoEntretenimentoService tipoEntretenimentoService;
	
	@Autowired
	private CampoTipoEntretenimentoService campoTipoEntretenimentoService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView("entretenimento/cadastrar");
		
		List<TipoEntretenimento> tiposDeEntretenimento = tipoEntretenimentoService.buscarTiposDeEntretenimento();
		mv.addObject("tiposDeEntretenimento", tiposDeEntretenimento);
		
		return mv;
	}
	
	@RequestMapping(value = "/campos/tipo/entretenimento/{idTipoEntretenimento}", method = RequestMethod.GET)
	public String carregarCamposTipoEntretenimento(ModelMap modelMap, @PathVariable("idTipoEntretenimento") Integer idTipoEntretenimento) {
		Map<String, Boolean> campos = campoTipoEntretenimentoService.campoObrigatorioPorTipoEntretenimento(idTipoEntretenimento);
		modelMap.addAttribute("campos", campos);
		
		return "entretenimento/fragments/campos :: camposTipoEntretenimento";
	}
	
	
	
}
