/*
 * Pedir números hasta que se introduzca 
 * uno negativo, y calcular la media.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int numero, suma = 0, media, contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número"));

        while (numero >= 0) {
            contador++;
            suma += numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número"));
        }
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Errror div 0");
        } else {
            media = suma / contador;
            JOptionPane.showMessageDialog(null, "La suma es " + suma);
            JOptionPane.showMessageDialog(null, "La media es " + media);
        }
    }
}
