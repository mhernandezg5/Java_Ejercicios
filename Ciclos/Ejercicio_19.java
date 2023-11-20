/*
 *  Dadas 6 notas, escribir la cantidad
 * de alumnos aprobados, condicionados
 * (=4) y suspensos.
 * 0 a 3 se queda
 * 4 condicionado
 * 5 a 10 aprobado
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_19 {

  public static void main(String[] args) {
    int notas, perdido = 0, condicionado = 0, aprobado = 0;

    for (int contador = 1; contador <= 6; contador++) {
      notas =
        Integer.parseInt(JOptionPane.showInputDialog(contador + ". NOTAS: "));
      if (notas >= 0 && notas <= 3) {
        perdido++;
      } else if (notas == 4) {
        condicionado++;
      } else if (notas >= 5 && notas <= 10) {
        aprobado++;
      } else {
        JOptionPane.showMessageDialog(
          null,
          "Error!!! \n La nota debe ser entre 0 y 10"
        );
      }
    }
    JOptionPane.showMessageDialog(
      null,
      "Perdidos: " +
      perdido +
      "\n Condicionados: " +
      condicionado +
      "\n Aprobados: " +
      aprobado
    );
  }
}
