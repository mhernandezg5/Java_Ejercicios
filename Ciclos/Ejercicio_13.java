/*
 * Pedir 10 números.
 * Mostrar la media de los números positivos,
 * la media de los números negativos y la
 * cantidad de ceros.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_13 {

  public static void main(String[] args) {
    int numero, contador, suma_enteros = 0, media_enteros;
    for (contador = 1; contador < 11; contador++) {
      numero =
        Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
      suma_enteros += numero;
    }
    //System.out.println(suma_enteros);
    // System.out.println(contador);
    media_enteros = suma_enteros / (contador - 1);

    //Mostrar la media de los enteros
    JOptionPane.showMessageDialog(
      null,
      "La media de los positivos es: " + media_enteros
    );
  }
}
