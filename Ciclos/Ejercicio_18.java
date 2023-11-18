/*
 * Hacer unas modificaciones al ejercicio anterior
 * suponiendo que no se introduce el precio por litro.
 * Solo existen tres productos con precios:
 *
 * 1- 0,6 $/litro
 * 2- 3 $/litro
 * 3- 1,25 $/litro.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_18 {

  public static void main(String[] args) {
    //Variables globales
    int contador, factura_mayor = 0;
    double litros = 0, suma_litros = 0, suma_precios = 0, total = 0, articulo1 =
      0;
    //nuevo

    double producto_1 = 0.6, producto_2 = 3.00, producto_3 = 1.25;
    suma_precios = producto_1 + producto_2 + producto_3;

    for (contador = 1; contador <= 3; contador++) {
      // leer datos del teclado
      litros =
        Double.parseDouble(
          JOptionPane.showInputDialog(
            "Cantidad Artículo: " + contador + " \nLitros"
          )
        );

      //sumar la catidad de litros
      suma_litros += litros;
      if (contador == 1) {
        articulo1 = litros;
      }
    }

    if (total > 600) {
      factura_mayor++;
    }

    JOptionPane.showMessageDialog(
      null,
      "Total de litros: " +
      suma_litros +
      "\n Total de precios: " +
      suma_precios +
      "\n Total: " +
      total +
      "\n\n Articul #1: " +
      articulo1 +
      "  Lts" +
      "\n Fact mayores a $600.00: " +
      factura_mayor
    );
    /*pruebas de resultados
    System.out.println(suma_litros);
    System.out.println(suma_precios);
    System.out.println(total);
    System.out.println(articulo1);
    System.out.println(factura_mayor);*/
  }
}
