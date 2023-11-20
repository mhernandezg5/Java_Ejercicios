/*
 * Pedir 10 números, y mostrar al final
 * si se ha introducido alguno negativo.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_21 {

  public static void main(String[] args) {
    int numero, negativo = 0;

    for (int contador = 1; contador <= 10; contador++) {
      numero =
        Integer.parseInt(JOptionPane.showInputDialog(contador + ". Número: "));
      if (numero < 0) {
        negativo++;
      }
    }
    if (negativo != 0) {
      JOptionPane.showMessageDialog(
        null,
        "Se ingresó " + negativo + " negativo (s)"
      );
    } else if (negativo >= 0) {
      JOptionPane.showMessageDialog(null, "Solo hay positivos");
    }
  }
}
