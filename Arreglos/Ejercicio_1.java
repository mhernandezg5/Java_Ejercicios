/*
 * Leer 5 números, guardarlos en un arreglo 
 * y mostrarlos en el mismo orden introducido.
 */
package Arreglos;

import javax.swing.JOptionPane;

public class Ejercicio_1 {
  public static void main(String[] args) {
    int[] numeros = new int[5];
    for (int contador = 0; contador < numeros.length; contador++) {
      numeros[contador] = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número enter:"));
    }
    for (int iterador = 0; iterador < numeros.length; iterador++) {
      System.out.println(iterador + 1 + ": " + numeros[iterador]);
    }
  }
}
