package port.brunobraatz.lista_jogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import port.brunobraatz.lista_jogos.entities.Jogo;

//Realiza consultas no banco de dados
public interface JogoRepository extends JpaRepository<Jogo, Long> {
}
