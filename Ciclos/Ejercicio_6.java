/*
 * Pedir números hasta que se teclee un 0, 
 * mostrar la suma de todos los números. introducidos.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int numero, suma = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número"));

        while (numero != 0) {
            suma += numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número"));
        }
        JOptionPane.showMessageDialog(null, "La suma es " + suma);
    }
}
