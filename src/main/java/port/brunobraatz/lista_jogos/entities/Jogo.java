package port.brunobraatz.lista_jogos.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tbl_jogo")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer anoLancamento;
    private String genero;
    private String plataformas;
    private Double pontuacao;
    private String imgUrl;

    /* Se não especificar como TEXT, a JPA irá reconhecer automaticamente o String como um
     "varchar, 255" no banco de dados, por isso foi especificado como TEXT, para suportar mais caracteres. */
    @Column(columnDefinition = "TEXT")
    private String descCurta;

    @Column(columnDefinition = "TEXT")
    private String descLonga;

    //Construtor vazio
    public Jogo() {
    }

    //Construtor com parâmetros
    public Jogo(Long id, String titulo, Integer anoLancamento, String genero,
                String plataformas, Double pontuacao, String imgUrl, String descCurta, String descLonga) {
        this.id = id;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.plataformas = plataformas;
        this.pontuacao = pontuacao;
        this.imgUrl = imgUrl;
        this.descCurta = descCurta;
        this.descLonga = descLonga;
    }

    //Equals e Hashcode


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Jogo other = (Jogo) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //toString
    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", genero='" + genero + '\'' +
                ", plataformas='" + plataformas + '\'' +
                ", pontuacao=" + pontuacao +
                ", imgUrl='" + imgUrl + '\'' +
                ", descCurta='" + descCurta + '\'' +
                ", descLonga='" + descLonga + '\'' +
                '}';
    }

    //Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescCurta() {
        return descCurta;
    }

    public void setDescCurta(String descCurta) {
        this.descCurta = descCurta;
    }

    public String getDescLonga() {
        return descLonga;
    }

    public void setDescLonga(String descLonga) {
        this.descLonga = descLonga;
    }
}
