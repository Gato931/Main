package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public abstract class Persona {
  public String nombre;
  public String apellido;
  public String nacionalidad;
  public LocalDateTime fechaNacimiento;
  public Persona(String nombre, String apellido, String nacionalidad, LocalDateTime fechaNacimiento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.nacionalidad = nacionalidad;
    this.fechaNacimiento = fechaNacimiento;
  }
  public String getNombre() {
    return nombre;
  }
  public String getApellido() {
    return apellido;
  }
  public String getNacionalidad() {
    return nacionalidad;
  }
  public LocalDateTime getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
  public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  @Override
  public String toString() {
    return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad
        + ", fechaNacimiento=" + fechaNacimiento + "]";
  }

}
