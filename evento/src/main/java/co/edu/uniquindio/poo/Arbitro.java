package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class Arbitro extends Persona{
  private String categoria;

  public Arbitro(String nombre, String apellido, String nacionaldiad, LocalDateTime fechaNacimiento, String categoria) {
    super(nombre, apellido, nacionaldiad, fechaNacimiento);
    this.categoria = categoria;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  @Override
  public String toString() {
    return "Arbitro [nombre=" + nombre + ", categoria=" + categoria + ", apellido=" + apellido + ", nacionalidad="
        + nacionalidad + ", fechaNacimiento=" + fechaNacimiento + "]";
  }

}
