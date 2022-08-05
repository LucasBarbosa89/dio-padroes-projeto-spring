package br.com.springproject.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.springproject.model.Endereco;

/**
 * Client HTTP criado via <b>OpenFeign</b> para o consumo da API <b>ViaCEP</b>.
 * @author lucas
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
