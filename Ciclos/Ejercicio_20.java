/*
 * Pedir un número N, introducir
 * N sueldos, y mostrar el
 * sueldo máximo.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_20 {

  public static void main(String[] args) {
    int numero_sueldos = Integer.parseInt(
      JOptionPane.showInputDialog("¿Cuántos sueldos quieres introducir?")
    );
    double sueldos = 0, temp_sueldos = 0;

    for (int contador = 1; contador <= numero_sueldos; contador++) {
      sueldos =
        Double.parseDouble(
          JOptionPane.showInputDialog(null, contador + ". Sueldo: ")
        );
      if (sueldos > temp_sueldos) {
        temp_sueldos = sueldos;
      }
    }
    System.out.println("Els ueldo mayor es: " + temp_sueldos);
  }
}
