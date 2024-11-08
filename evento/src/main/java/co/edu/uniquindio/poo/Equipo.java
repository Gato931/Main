package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Equipo {
  private String nombre;
  private String paisOrigen;
  private LinkedList<Atleta> atletas;

  public Equipo(String nombre, String paisOrigen, LinkedList<Atleta> atletas){
    this.nombre = nombre;
    this.paisOrigen = paisOrigen;
    this.atletas = atletas;
  }
  public LinkedList<Atleta> getAtletas(){
    return atletas;
  }
  public void setAtletas(LinkedList<Atleta> atletas){
    this.atletas = atletas;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getPaisOrigen() {
    return paisOrigen;
  }
  public void setPaisOrigen(String paisOrigen) {
    this.paisOrigen = paisOrigen;
  }
  @Override
  public String toString() {
    return "Equipo [nombre=" + nombre + ", paisOrigen=" + paisOrigen + ", atletas=" + atletas + "]";
  }

}