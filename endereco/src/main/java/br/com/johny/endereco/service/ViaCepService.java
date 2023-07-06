package br.com.johny.endereco.service;

import br.com.johny.endereco.response.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    EnderecoResponse obterCep(@PathVariable("cep") String cep);

}
