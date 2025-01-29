package port.brunobraatz.lista_jogos.services;

import org.springframework.beans.factory.annotation.Autowired;
import port.brunobraatz.lista_jogos.dto.JogoMinDTO;
import port.brunobraatz.lista_jogos.entities.Jogo;
import port.brunobraatz.lista_jogos.repositories.JogoRepository;

import java.util.List;

//Regra de negócio
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public List<JogoMinDTO> buscaJogos() {
        List<Jogo> result = jogoRepository.findAll();
        List<JogoMinDTO> dto = result.stream().map(jogo -> new JogoMinDTO(jogo)).toList();
        return dto;
    }
    /*
        *Realizado desta maneira apenas para ser mais didático*

        Cria-se uma lista chamada "result", do tipo [Jogo], então é chamado o metodo findAll() da JPA para consultar
        os itens no banco de dados, então ela irá retornar todos os itens cadastrados, nesse caso os jogos
        e gravar na lista "result".

            List<Jogo> result = jogoRepository.findAll();
        */


        /*
        Depois é criada uma lista chamada "dto" do tipo [JogoMinDto], que terá o mínimo de atributos a ser mostrado nos resultados,
        e essa lista irá receber a lista inteira de cadastros "result" e irá filtrar apenas conforme os resultados desejados,
        utilizando o metodo stream() para manipular o fluxo das informações, depois mapear os dados através do map(),
        passando como parâmetro o objeto "Jogo", map(jogo -> new JogoMinDTO(jogo)) e retornando as informações classificadas,
        pelo toList().

        List<JogoMinDTO> dto = result.stream().map(jogo -> new JogoMinDTO(jogo)).toList();

        */


        /*
        Mas tudo poderia ser feito resumido, desta maneira:
            ToDo:  return jogoRepository.findAll().stream().map(jogo -> new JogoMinDTO(jogo)).toList();

        */

}
