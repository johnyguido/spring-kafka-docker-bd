package br.com.johny.endereco.resource;

import br.com.johny.endereco.service.ViaCepService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("cep")
public class CepResource {

    private final ViaCepService viaCepService;

    @GetMapping("/{cep}")
    public ResponseEntity<?> obterCep(@PathVariable ("cep") String cep){
        return ResponseEntity.ok(viaCepService.obterCep(cep));
    }

}
