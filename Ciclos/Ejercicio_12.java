/*
 * Pedir un número y calcular
 * su factorial
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_12 {

  public static void main(String[] args) {
    int factorial = 1;
    int numero = Integer.parseInt(
      JOptionPane.showInputDialog("Ingrese un número")
    );
    for (int contador = 1; contador <= numero; contador++) {
      //System.out.println(contador);
      factorial *= contador;
    }
    JOptionPane.showMessageDialog(
      null,
      "El factorial de " + numero + " es " + factorial
    );
  }
}
