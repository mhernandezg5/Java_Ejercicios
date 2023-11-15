/*
 * Pedir un número N y mostrar todos
 * los números del 1 al N
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_8 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));

        for (int contador = 1; contador <= numero; contador++) {
            System.out.print(contador + "  ");

            // PROBAR CON WHILE
        }
    }
}
