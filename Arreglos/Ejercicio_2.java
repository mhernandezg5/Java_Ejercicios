/*
 * Leer 5 números, guardarlos en un arreglo 
 * y mostrarlos en el orden inverso al introducido.
 */
package Arreglos;

import javax.swing.JOptionPane;

public class Ejercicio_2 {
  public static void main(String[] args) {
    int[] numero = new int[5];
    for (int contador = 0; contador < numero.length; contador++) {
      numero[contador] = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número enter:"));
    }
    for (int iterador = numero.length - 1; iterador >= 0; iterador--) {
      System.out.println(numero[iterador]);
    }
  }
}
