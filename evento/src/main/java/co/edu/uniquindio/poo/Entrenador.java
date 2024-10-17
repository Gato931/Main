package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class Entrenador extends Persona{
  private String especializacion;

  public Entrenador(String nombre, String apellido, String nacionalidad, LocalDateTime fechaNacimiento,
      String especializacion) {
    super(nombre, apellido, nacionalidad, fechaNacimiento);
    this.especializacion = especializacion;
  }

  public String getEspecializacion() {
    return especializacion;
  }

  public void setEspecializacion(String especializacion) {
    this.especializacion = especializacion;
  }

  @Override
  public String toString() {
    return "Entrenador [nombre=" + nombre + ", especializacion=" + especializacion + ", apellido=" + apellido
        + ", nacionalidad=" + nacionalidad + ", fechaNacimiento=" + fechaNacimiento + "]";
  }

}
