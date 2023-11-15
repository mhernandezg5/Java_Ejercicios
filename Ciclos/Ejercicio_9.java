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
    //100 93 86 79 72 65 58 51 44 37 30 23 16 9 2
  }
}
