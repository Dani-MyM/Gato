public class Gato {
    
  // El nombre completo del dueno.
  private String nombreCompletoDueno;
  // Cantidad (en kiligramos) de pienso que consume el gato a la semana.
  private int cantidadKilogramosPiensoSemana;
  // Vacunación del gato.
  private boolean gatoVacunado;
  /**
   * Crea una clase en la que se muestra el dueno de un gato, 
   * los kilogramos de pienso que consume a la semana 
   * y si esta vacunado o no.
   */
  public Gato(String nombreCompletoDelDueno, int cantidadKilogramosDePiensoSemana) {
      nombreCompletoDueno = nombreCompletoDelDueno;
      cantidadKilogramosPiensoSemana = cantidadKilogramosDePiensoSemana;
      gatoVacunado = true;
  }
  
  /**
   * Devuelve el nombre completo del dueno.
   */
  public String getNombreCompletoDueno() {
      return nombreCompletoDueno;
  }
  
  /**
   * Devuelve la cantidad de pienso, en kilogramos, 
   * que consume el gato a la semana.
   */
  public int getCantidadKilogramosPiensoSemana() {
      return cantidadKilogramosPiensoSemana;
  }
  
  /**
   * Nos da la informacion nesesaria para saber si el gato esta
   * vacunado o no.
   */
  public boolean getGatoVacunado() {
      return gatoVacunado;
  }    
  
  /**
   * Fija el valor del atributo nombreCompletoDueño mediante un parametro.
   */
  public void setNombreCompletoDueño(String nombreCompletoDelDueno) {
      nombreCompletoDueno = nombreCompletoDelDueno;
  }
  
  /**
   * Modifica mediante un parametro el valor de cantidadKilogramosPiensoSemana.
   */
  public void comprarKilogramosPienso(int cantidadIntroducida) {
     cantidadKilogramosPiensoSemana = cantidadKilogramosPiensoSemana + cantidadIntroducida;
  } 
  
  /**
   * Modifica el valor de gatoVacunado cambiandolo alternativamente entre true y false.
   */
  public void vacunarGato() {
      if (gatoVacunado == true) {
          gatoVacunado = false;
      } 
      else {
          gatoVacunado = true;
      }
  } 
  
  /**
   * Imprime por pantalla el estado del objeto.
   */
  public void imprimeDetalles() {
      System.out.println("Dueno:" + nombreCompletoDueno + "| Kilogramos de pienso a la semana:" + cantidadKilogramosPiensoSemana + "|" + "Vacunado:" + gatoVacunado);
  }
  
  /**
   * Devuelve el contenido del estado del objeto.
   */
  public String devuelveDetalles() {
        String devuelveDetalles = ("Dueno:" + nombreCompletoDueno  + "| Kilogramos de pienso a la semana:" +  cantidadKilogramosPiensoSemana + "|" + "Vacunado:" + gatoVacunado);
        return devuelveDetalles;
  }
}          