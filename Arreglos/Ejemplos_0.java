/*
 * Sección de ejemplos
 */
package Arreglos;

public class Ejemplos_0 {

  public static void main(String[] args) {
    // constrctor de un objeto
    int[] numeros = new int[3];

    numeros[0] = 1991;
    numeros[1] = 1999;
    numeros[2] = 2017;

    /*
     * System.out.println(numeros[2]);
     * System.out.println(numeros[1]);
     * System.out.println(numeros[0]);
     */

    for (int contador = 0; contador <= numeros.length; contador++) {
      System.out.println(numeros[contador]);

    }
  }
}
