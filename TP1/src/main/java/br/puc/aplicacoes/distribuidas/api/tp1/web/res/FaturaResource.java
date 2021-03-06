package br.puc.aplicacoes.distribuidas.api.tp1.web.res;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.FaturaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.service.FaturaService;

@RestController
@RequestMapping("/api")
public class FaturaResource {
	
	private final FaturaService faturaService;
	
	public FaturaResource(FaturaService faturaService) {
		this.faturaService = faturaService;
	}
	
	@PostMapping("/faturas")
	public FaturaDTO createFatura(@RequestBody FaturaDTO faturaDTO){
		FaturaDTO result = faturaService.salvar(faturaDTO);
		return result;
	}
	
	
}
