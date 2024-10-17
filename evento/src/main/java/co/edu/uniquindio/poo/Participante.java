package co.edu.uniquindio.poo;

public class Participante {
  private int edad;
  private String pais;
  private Persona persona;
  private TipoParticipante tipoParticipante;
  public Participante(int edad, String pais, Persona persona, TipoParticipante tipoParticipante) {
    this.edad = edad;
    this.pais = pais;
    this.persona = persona;
    this.tipoParticipante = tipoParticipante;
  }
  public int getEdad() {
    return edad;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }
  public TipoParticipante getTipoParticipante() {
    return tipoParticipante;
  }
  public void setTipoParticipante(TipoParticipante tipoParticipante){
    this.tipoParticipante = tipoParticipante;
  }
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }
  public Persona getPersona() {
    return persona;
  }
  public void setPersona(Persona persona) {
    this.persona = persona;
  }
  @Override
  public String toString() {
    return "Participante [edad=" + edad + ", pais=" + pais + ", persona=" + persona + ", tipoParticipante="
        + tipoParticipante + "]";
  }

}