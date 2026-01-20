package dev.java10x.CadastroDeCarros.Carros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Define a classe como controller REST
@RequestMapping //Mapeia URL + método HTTP
public class CarrosController {
    @GetMapping("/boasvindas")//Mapeia requisições HTTP GET
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }
}
