public class Gato {
    
  // El nombre completo del due�o.
  private String nombreCompletoDue�o;
  // Cantidad (en kiligramos) de pienso que consume el gato a la semana.
  private int cantidadKilogramosPiensoSemana;
  // Vacunaci�n del gato.
  private boolean gatoVacunado;
  /**
   * Crea una clase en la que se muestra el due�o de un gato, 
   * los kilogramos de pienso que consume a la semana 
   * y si est� vacunado o no.
   */
  public Gato(String nombreCompletoDelDue�o, int cantidadKilogramosDePiensoSemana) {
      nombreCompletoDue�o = nombreCompletoDelDue�o;
      cantidadKilogramosPiensoSemana = cantidadKilogramosDePiensoSemana;
      gatoVacunado = true;
  }
  
  /**
   * Devuelve el nombre completo del due�o.
   */
  public String getNombreCompletoDue�o() {
      return nombreCompletoDue�o;
  }
  
  /**
   * Devuelve la cantidad de pienso, en kilogramos, 
   * que consume el gato a la semana.
   */
  public int getCantidadKilogramosPiensoSemana() {
      return cantidadKilogramosPiensoSemana;
  }
  
  /**
   * Nos da la informaci�n nesesaria para saber si el gato est� 
   * vacunado o no.
   */
  public boolean getGatoVacunado() {
      if (gatoVacunado == true) {
          return true;
      }
      else {
          return false;
      } 
  }    
  
  /**
   * Fija el valor del atributo nombreCompletoDue�o mediante un par�metro.
   */
  public void setNombreCompletoDue�o(String nombreCompletoDelDue�o) {
      nombreCompletoDue�o = nombreCompletoDelDue�o;
  }
  
  /**
   * Modifica mediante un par�metro el valor de cantidadKilogramosPiensoSemana.
   */
  public void comprarKilogramosPienso(int cantidadIntroducida) {
     cantidadKilogramosPiensoSemana = cantidadKilogramosPiensoSemana + cantidadIntroducida;
  } 
  
  /**
   * Modifica el valor de gatoVacunado cambi�ndolo alternativamente entre true y false.
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
      System.out.println("Due�o:" + nombreCompletoDue�o);
      System.out.println("Kilogramos de pienso a la semana:" + cantidadKilogramosPiensoSemana);
      System.out.println("Vacunado:" + gatoVacunado);
  }
  
  /**
   * Devuelve el contenido del estado del objeto.
   */
  public String devuelveDetalles() {
        String devuelveDetalles = nombreCompletoDue�o  +  cantidadKilogramosPiensoSemana  + gatoVacunado;
        return devuelveDetalles;
  }
}          