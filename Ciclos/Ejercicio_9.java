/*
 * Escribir todos los números del 100 al 0
 * de 7 en 7
 */
package Ciclos;

public class Ejercicio_9 {

  public static void main(String[] args) {
    for (int contador = 100; contador >= 0; contador -= 7) {
      System.out.print(contador + " ");
    }
  }
}
