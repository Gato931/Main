package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;


/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    LocalDateTime localHora = LocalDateTime.of(2049,1,1,1,1);
  }
  public static LinkedList<Atleta> atletasParticipantes(LinkedList<EventoDeportivo> eventosDeportivos) {
    EventoDeportivo eventoDeseado = new EventoDeportivo();
    for(EventoDeportivo evento: eventosDeportivos) {
      if(evento.getTipoEvento().equals(TipoEvento.COMPETICION) && evento.getDeporte().equals("natacion")) {
        eventoDeseado = evento;
        break;
      }
    }
    return eventoDeseado.getAtletas();
  }
}


