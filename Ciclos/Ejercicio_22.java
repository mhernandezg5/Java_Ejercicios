/*
 * Pedir 5 calificaciones de alumnos
 * y decir al final si hay algún suspenso.
 * reprobado <5
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_22 {

  public static void main(String[] args) {
    int notas, reprobado = 0;
    for (int contador = 1; contador <= 5; contador++) {
      notas =
        Integer.parseInt(JOptionPane.showInputDialog(contador + ". Nota: "));
      if (notas < 5) {
        reprobado++;
      }
    }
    if (reprobado != 0) {
      JOptionPane.showMessageDialog(
        null,
        "Hay " + reprobado + " Alumnos reprobados"
      );
    }
  }
}
