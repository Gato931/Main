package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class Atleta extends Persona{
  private int añosExperiencia;

  public Atleta(String nombre, String apellido, String nacionalidad, LocalDateTime fechaNacimiento, int añosExperiencia) {
    super(nombre, apellido, nacionalidad, fechaNacimiento);
    this.añosExperiencia = añosExperiencia;
  }

  public int getAñosExperiencia() {
    return añosExperiencia;
  }

  public void setAñosExperiencia(int añosExperiencia) {
    this.añosExperiencia = añosExperiencia;
  }

  @Override
  public String toString() {
    return "Atleta [nombre=" + nombre + ", añosExperiencia=" + añosExperiencia + ", apellido=" + apellido
        + ", nacionalidad=" + nacionalidad + ", fechaNacimiento=" + fechaNacimiento + "]";
  }

}
