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
    int numero, contador, suma_positivos =
      0, media_positivos, contador_positivos = 0, suma_negativos =
      0, contador_negativos = 0, media_negativos, contador_ceros = 0;
    for (contador = 1; contador < 11; contador++) {
      numero =
        Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
      if (numero > 0) {
        contador_positivos++;
        suma_positivos += numero;
      } else if (numero < 0) {
        contador_negativos++;
        suma_negativos += numero;
      } else if (numero == 0) {
        contador_ceros++;
      } else if (contador == 0) {
        JOptionPane.showMessageDialog(null, "Error div 0 !");
      }
    }
    //System.out.println(suma_enteros);
    // System.out.println(contador);
    media_positivos = suma_positivos / (contador_positivos - 1);
    media_negativos = suma_negativos / (contador_negativos - 1);

    //Mostrar la media de los enteros
    JOptionPane.showMessageDialog(
      null,
      "La media de los positivos es: " + media_positivos
    );
    JOptionPane.showMessageDialog(
      null,
      "La media de los negativos es: " + media_negativos
    );
    JOptionPane.showMessageDialog(
      null,
      "La cantidad de ceros es: " + contador_ceros
    );
  }
}
