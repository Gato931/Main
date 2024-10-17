package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class PersonalApoyo extends Persona{
  private int experinciaLaboral;

  public PersonalApoyo(String nombre, String apellido, String nacionalidad, LocalDateTime fechaNacimiento,
      int experinciaLaboral) {
    super(nombre, apellido, nacionalidad, fechaNacimiento);
    this.experinciaLaboral = experinciaLaboral;
  }

  public int getExperinciaLaboral() {
    return experinciaLaboral;
  }

  public void setExperinciaLaboral(int experinciaLaboral) {
    this.experinciaLaboral = experinciaLaboral;
  }

  @Override
  public String toString() {
    return "PersonalApoyo [nombre=" + nombre + ", experinciaLaboral=" + experinciaLaboral + ", apellido=" + apellido
        + ", nacionalidad=" + nacionalidad + ", fechaNacimiento=" + fechaNacimiento + "]";
  }

}
