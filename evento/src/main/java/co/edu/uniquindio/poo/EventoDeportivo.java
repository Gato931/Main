package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class EventoDeportivo {
  private String nombre;
  private String deporte;
  private LocalDateTime fechaInicio;
  private Ubicacion ubicacion;
  private TipoEvento tipoEvento;
  private LinkedList<Participante> participantes;
  private LinkedList<Equipo> equipos;

  public EventoDeportivo(String nombre, String deporte, LocalDateTime     fechaInicio, Ubicacion ubicacion,
      TipoEvento tipoEvento, LinkedList<Participante> participantes, LinkedList<Equipo> equipos) {
    this.nombre = nombre;
    this.deporte = deporte;
    this.fechaInicio = fechaInicio;
    this.ubicacion = ubicacion;
    this.tipoEvento = tipoEvento;
    this.participantes = participantes;
    this.equipos = equipos;
  }
  public EventoDeportivo(){
    this.nombre = "";
    this.deporte = "";
    this.fechaInicio = LocalDateTime.now();
    this.ubicacion = new Ubicacion("Colombia", "Bogota");
    this.tipoEvento = TipoEvento.COMPETICION;
    this.participantes = new LinkedList<>();
    this.equipos = new LinkedList<>();
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getDeporte() {
    return deporte;
  }
  public void setDeporte(String deporte) {
    this.deporte = deporte;
  }
  public LocalDateTime getFechaInicio() {
    return fechaInicio;
  }
  public void setFechaInicio(LocalDateTime fechaInicio) {
    this.fechaInicio = fechaInicio;
  }
  public Ubicacion getUbicacion() {
    return ubicacion;
  }
  public void setUbicacion(Ubicacion ubicacion) {
    this.ubicacion = ubicacion;
  }
  public TipoEvento getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEvento tipoEvento) {
    this.tipoEvento = tipoEvento;
  }
  public LinkedList<Participante> getParticipantes() {
    return participantes;
  }
  public void setParticipantes(LinkedList<Participante> participantes) {
    this.participantes = participantes;
  }
  public LinkedList<Equipo> getEquipos() {
    return equipos;
  }
  public void setEquipos(LinkedList<Equipo> equipos) {
    this.equipos = equipos;
  }
  @Override
  public String toString() {
    return "EventoDeportivo [nombre=" + nombre + ", deporte=" + deporte + ", fechaInicio=" + fechaInicio
        + ", ubicacion=" + ubicacion + ", tipoEvento=" + tipoEvento + ", participante=" + participantes + ", equipos="
        + equipos + "]";
  }

  public LinkedList<Atleta> getAtletas() {
    LinkedList<Atleta> atletasEvento = new LinkedList<>();
    for (Participante participante : participantes) {
        if (participante.getTipoParticipante() == TipoParticipante.ATLETA && participante.getPersona() instanceof Atleta) {
            Atleta atleta = (Atleta) participante.getPersona();
            atletasEvento.add(atleta);
        }
    }
    for (Equipo equipo : equipos) {
      LinkedList<Atleta> atletasEquipo = equipo.getAtletas();
      atletasEvento.addAll(atletasEquipo);
    }
    return atletasEvento;
  }

}



