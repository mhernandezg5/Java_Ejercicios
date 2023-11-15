/*
 * Diseñar un programa que muestre el
 * producto de los 10 primeros números impares
 */
package Ciclos;

public class Ejercicio_11 {

  public static void main(String[] args) {
    int suma = 1;
    for (int contador = 1; contador <= 20; contador++) {
      if (contador % 2 != 0) {
        // System.out.println(contador);
        suma *= contador;
      }
    }
    System.out.println("El producto es: " + suma);
  }
}
