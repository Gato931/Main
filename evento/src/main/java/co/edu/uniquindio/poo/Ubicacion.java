package co.edu.uniquindio.poo;

public class Ubicacion {
  private String pais;
  private String ciudad;

  Ubicacion(String pais, String ciudad) {
    this.pais = pais;
    this.ciudad = ciudad;
  }

  public String getPais() {
    return pais;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  @Override
  public String toString() {
    return "Ubicacion [pais=" + pais + ", ciudad=" + ciudad + "]";
  }

}
