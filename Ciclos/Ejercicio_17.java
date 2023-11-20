/*
 * Una empresa que se dedica a la venta de desinfectantes
 * necesita un programa para gestionar las facturas.
 * En cada factura figura: el código del artículo,
 * la cantidad vendida en litros y el precio por litro.
 * Se pide de 5 facturas introducidas: Facturación total,
 * cantidad en litros vendidos del artículo 1 y cuantas
 * facturas se emitieron de más de $600.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_17 {

  public static void main(String[] args) {
    //Variables globales
    int contador, factura_mayor = 0, codigo_articulo = 0;
    double litros = 0, suma_litros = 0, precio_litros = 0, suma_precios =
      0, sub_total, total = 0, articulo1 = 0;

    for (contador = 1; contador <= 2; contador++) {
      // leer datos del teclado
      codigo_articulo =
        Integer.parseInt(JOptionPane.showInputDialog(contador + ". Código "));
      litros =
        Double.parseDouble(
          JOptionPane.showInputDialog(
            contador + ". Litros \n" + "Artículo: " + codigo_articulo
          )
        );
      precio_litros =
        Double.parseDouble(
          JOptionPane.showInputDialog(contador + ". Precio por litro")
        );

      //sumar la catidad de litros
      suma_litros += litros;
      suma_precios += precio_litros;
      sub_total = litros * precio_litros;
      total += sub_total;

      if (contador == 1) {
        articulo1 = litros;
      }
      if (sub_total > 600) {
        factura_mayor += contador;
      }
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
