/*
 * Leer un número e indicar si es positivo o negativo.
 * El proceso se repetirá hasta que se introduzca un 0
 */
package Ciclos;

import javax.swing.JOptionPane;;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número"));
        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo");
            } else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número"));
        }
    }
}
