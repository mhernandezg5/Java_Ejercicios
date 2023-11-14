/*
 * Pedir números hasta que se introduzca 
 * uno negativo, y calcular la media.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int numero, contador = 0, suma = 0, media;
        do {

            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número"));
            suma += numero;
            System.out.println(suma + " ------------ " + contador);

        } while (numero >= 0);

    }
}
