package port.brunobraatz.lista_jogos.dto;

import port.brunobraatz.lista_jogos.entities.Jogo;

//Define os atributos mínimos para exibir nas consultas
public class JogoMinDTO {

    private Long id;
    private String titulo;
    private Integer anoLancamento;
    private String imgUrl;
    private String descCurta;

    //Construtor vazio
    public JogoMinDTO(){
    }

    //Construtor com parâmetros
    public JogoMinDTO(Jogo jogo){
        this.id = jogo.getId();
        this.titulo = jogo.getTitulo();
        this.anoLancamento = jogo.getAnoLancamento();
        this.imgUrl = jogo.getImgUrl();
        this.descCurta = jogo.getDescCurta();
    }

}
