package port.brunobraatz.lista_jogos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import port.brunobraatz.lista_jogos.dto.JogoMinDTO;
import port.brunobraatz.lista_jogos.services.JogoService;

import java.util.List;

@RestController
@RequestMapping(value = "/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    public List<JogoMinDTO> buscaJogos(){
        List<JogoMinDTO> result = jogoService.buscaJogos();
        return result;

        /* Mais prático

         ToDo: return jogoService.buscaJogos();

         */
    }
}
