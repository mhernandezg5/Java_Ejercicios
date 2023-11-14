/*
 * Leer números hasta que se introduzca un 0. 
 * Para cada uno indicar si es par o impar.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, " Par " + numero);

            } else {
                JOptionPane.showMessageDialog(null, "Impar " + numero);
            }
        } while (numero != 0);

    }
}
