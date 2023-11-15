/*
 * Pedir 10 números y escribir la suma total
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_10 {

  public static void main(String[] args) {
    int suma = 0;
    for (int contador = 1; contador <= 10; contador++) {
      int numero = Integer.parseInt(
        JOptionPane.showInputDialog("Escriba un número")
      );
      suma = suma + numero;
    }
    JOptionPane.showMessageDialog(null, "La suma es: " + suma);
  }
}
