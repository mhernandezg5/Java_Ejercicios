/*
 * Perdir 10 sueldos. Mostrar su suma
 * Y cuantos hay mayores de $ 1,000
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_14 {

  public static void main(String[] args) {
    double sueldo = 0, suma_sueldos = 0;
    int contador, contador_sueldos = 02;
    for (contador = 1; contador < 11; contador++) {
      sueldo =
        Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo $ "));
      // System.out.println(contador + " : " + sueldo);
      if (sueldo > 1000) {
        contador_sueldos++;
      }
      suma_sueldos += sueldo;
    }
    JOptionPane.showMessageDialog(null, "Los sueldos suman: " + suma_sueldos);
    JOptionPane.showMessageDialog(
      null,
      "Los sueldos mayores a $ 1,000.00 son: " + contador_sueldos
    );
    /*
    System.out.println(suma_sueldos);
    System.out.println(contador_sueldos);
    */
  }
}
