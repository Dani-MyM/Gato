public class Gato {
    
  // El nombre completo del dueño.
  private String nombreCompletoDueño;
  // Cantidad (en kiligramos) de pienso que consume el gato a la semana.
  private int cantidadKilogramosPiensoSemana;
  // Vacunación del gato.
  private boolean gatoVacunado;
  /**
   * Crea una clase en la que se muestra el dueño de un gato, 
   * los kilogramos de pienso que consume a la semana 
   * y si está vacunado o no.
   */
  public Gato(String nombreCompletoDelDueño, int cantidadKilogramosDePiensoSemana) {
      nombreCompletoDueño = nombreCompletoDelDueño;
      cantidadKilogramosPiensoSemana = cantidadKilogramosDePiensoSemana;
      gatoVacunado = true;
  }
  
  /**
   * Devuelve el nombre completo del dueño.
   */
  public String getNombreCompletoDueño() {
      return nombreCompletoDueño;
  }
  
  /**
   * Devuelve la cantidad de pienso, en kilogramos, 
   * que consume el gato a la semana.
   */
  public int getCantidadKilogramosPiensoSemana() {
      return cantidadKilogramosPiensoSemana;
  }
  
  /**
   * Nos da la información nesesaria para saber si el gato está 
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
   * Fija el valor del atributo nombreCompletoDueño mediante un parámetro.
   */
  public void setNombreCompletoDueño(String nombreCompletoDelDueño) {
      nombreCompletoDueño = nombreCompletoDelDueño;
  }
  
  /**
   * Modifica mediante un parámetro el valor de cantidadKilogramosPiensoSemana.
   */
  public void comprarKilogramosPienso(int cantidadIntroducida) {
     cantidadKilogramosPiensoSemana = cantidadKilogramosPiensoSemana + cantidadIntroducida;
  } 
  
  /**
   * Modifica el valor de gatoVacunado cambiándolo alternativamente entre true y false.
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
      System.out.println("Dueño:" + nombreCompletoDueño);
      System.out.println("Kilogramos de pienso a la semana:" + cantidadKilogramosPiensoSemana);
      System.out.println("Vacunado:" + gatoVacunado);
  }
  
  /**
   * Devuelve el contenido del estado del objeto.
   */
  public String devuelveDetalles() {
        String devuelveDetalles = nombreCompletoDueño  +  cantidadKilogramosPiensoSemana  + gatoVacunado;
        return devuelveDetalles;
  }
}          