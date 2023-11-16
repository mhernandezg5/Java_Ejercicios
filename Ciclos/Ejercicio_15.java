/*
 * Dadas las edades y alturas de 5 alumnos,
 * mostrar la edad y la estatura media, la
 * cantidad de alumnos mayores de 18 años,
 * y la cantidad de alumnos que miden más de 1.75
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_15 {

  public static void main(String[] args) {
    int edades, contador, contador_estatura = 0, suma_edades = 0, mayores =
      0, altos = 0;
    double estatura, suma_estatura = 0, estatura_media = 0;

    for (contador = 1; contador <= 5; contador++) {
      contador_estatura++;
      edades =
        Integer.parseInt(JOptionPane.showInputDialog("Ingresa una edad"));
      if (edades > 18) {
        mayores++;
      }
      estatura =
        Double.parseDouble(
          JOptionPane.showInputDialog("Ingresa la estatura en mts")
        );
      if (estatura > 1.75) {
        altos++;
      }
      suma_edades += edades;
      suma_estatura += estatura;
    }
    estatura_media = suma_estatura / contador_estatura;
    JOptionPane.showMessageDialog(
      null,
      "La suma de las edades es: " + suma_edades
    );

    JOptionPane.showMessageDialog(
      null,
      "La media de la estatura es: " + estatura_media
    );
    JOptionPane.showMessageDialog(
      null,
      "Hay " + mayores + " mayores a 18 años"
    );
    JOptionPane.showMessageDialog(null, "Hay " + altos + " mayores a 1.75");
    //PRUEBAS
    /* System.out.println("Hay " + mayores + " mayores a 18 años");
    System.out.println("Hay " + altos + " mayores a 1.75");
    System.out.println("Suma edades: " + suma_edades);
    System.out.println(contador_edad);
    System.out.println(contador_estatura);
    System.out.println("Estatura media: " + estatura_media);*/
  }
}
