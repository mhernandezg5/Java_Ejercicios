/*
 * Pedir un número N y mostrar
 * todos los numeros del 1 al N
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejerciio_8 {
    public static void main(String[] args) {
        int contador;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        for (contador = 1; contador <= numero; contador++) {
            System.out.println(contador + " ");
        }
    }
}
