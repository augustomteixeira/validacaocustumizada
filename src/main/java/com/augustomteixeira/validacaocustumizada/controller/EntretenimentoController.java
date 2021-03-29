package com.augustomteixeira.validacaocustumizada.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.augustomteixeira.validacaocustumizada.model.dto.EntretenimentoDto;
import com.augustomteixeira.validacaocustumizada.model.list.TipoEntretenimento;
import com.augustomteixeira.validacaocustumizada.service.CampoEntretenimentoObrigatoriedadeService;
import com.augustomteixeira.validacaocustumizada.service.CampoTipoEntretenimentoService;
import com.augustomteixeira.validacaocustumizada.service.EntretenimentoService;
import com.augustomteixeira.validacaocustumizada.service.TipoEntretenimentoService;

@Controller
public class EntretenimentoController {

	@Autowired
	private TipoEntretenimentoService tipoEntretenimentoService;

	@Autowired
	private CampoEntretenimentoObrigatoriedadeService campoEntretenimentoObrigatoriedadeService;

	@Autowired
	private EntretenimentoService entretenimentoService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView cadastrar(EntretenimentoDto entretenimentoDto) {
		ModelAndView mv = new ModelAndView("entretenimento/cadastrar");
		mv.addObject("entretenimentoDto", entretenimentoDto);

		List<TipoEntretenimento> tiposDeEntretenimento = tipoEntretenimentoService.buscarTiposDeEntretenimento();
		mv.addObject("tiposDeEntretenimento", tiposDeEntretenimento);

		return mv;
	}

	@RequestMapping(value = "/campos/tipo/entretenimento/{idTipoEntretenimento}", method = RequestMethod.GET)
	public String carregarCamposTipoEntretenimento(ModelMap modelMap,
			@PathVariable("idTipoEntretenimento") Integer idTipoEntretenimento) {
		Map<String, Boolean> campos = campoEntretenimentoObrigatoriedadeService
				.campoObrigatorioPorTipoEntretenimento(idTipoEntretenimento);
		modelMap.addAttribute("campos", campos);

		return "entretenimento/fragments/campos :: camposTipoEntretenimento";
	}

	@RequestMapping(value = "/entretenimento/salvar", method = RequestMethod.POST)
	public ModelAndView salvar(@Valid EntretenimentoDto entretenimentoDto) {
		ModelAndView mv = new ModelAndView("redirect:/");

		entretenimentoService.salvar(entretenimentoDto);

		return mv;
	}

}
