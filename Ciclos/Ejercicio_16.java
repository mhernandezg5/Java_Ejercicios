/*
 * Pide un número (que debe estar entre 0 y 10)
 * y mostrar la tabla de multiplicar de dicho número
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_16 {

  public static void main(String[] args) {
    int multiplicacion, numero;
    numero =
      Integer.parseInt(
        JOptionPane.showInputDialog("Escribe un numero entre 0 y 10")
      );
    if (numero >= 0 && numero <= 10) {
      for (int contador = 1; contador <= 10; contador++) {
        multiplicacion = numero * contador;
        System.out.println(numero + " X " + contador + " = " + multiplicacion);
      }
    } else {
      JOptionPane.showMessageDialog(null, "ERROR");
    }
  }
}
