/*
 * Leer 5 números por teclado, almacenarlos en un arreglo
 *  y a continuación realizar la media de los números 
 * positivos, la media de los negativos y contar el número de ceros.
 */
package Arreglos;

import javax.swing.JOptionPane;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int contador_positivos = 0, suma_positivos = 0, media_positivos;
        int contador_negativos = 0, suma_negativos = 0, media_negativos;
        int ceros = 0;
        int[] numeros = new int[5];

        for (int contador = 0; contador < numeros.length; contador++) {
            numeros[contador] = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número: "));
            if (numeros[contador] > 0) {
                contador_positivos++;
                suma_positivos += numeros[contador];

            } else if (numeros[contador] < 0) {
                contador_negativos++;
                suma_negativos += numeros[contador];

            } else if (numeros[contador] == 0) {
                ceros++;
            }
        }

        for (int i : numeros) {
            System.out.print(" - " + i);
        }
        System.out.println("----------------------------");
        // System.out.println("SUMA POS: " + suma_positivos);
        // System.out.println("Positivos: " + contador_positivos);
        media_positivos = suma_positivos / contador_positivos;
        System.out.println("MEDIA POS: " + media_positivos);
        // System.out.println("SUMA NEG: " + suma_negativos);
        // System.out.println("Negativos: " + contador_negativos);
        media_negativos = suma_negativos / contador_negativos;
        System.out.println("MEDIA NEG: " + media_negativos);
        System.out.println("CEROS:  " + ceros);

    }
}
