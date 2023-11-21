/*
 * Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: 
 * el 1º de A, 
 * el 1º de B, 
 * el 2° de A, 
 * el 2° de B, 
 * etc.
 */
package Arreglos;

import javax.swing.JOptionPane;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];

        // TABLA A
        for (int contador = 0; contador < A.length; contador++) {
            A[contador] = Integer.parseInt(JOptionPane.showInputDialog(contador + 1 + ". Número: "));

        }
        // TABLA B
        for (int contador = 0; contador < B.length; contador++) {
            B[contador] = Integer.parseInt(JOptionPane.showInputDialog(contador + 1 + ". Número: "));
        }
        for (int contador = 0; contador <= 20; contador++) {
            System.out.println(A[contador]);
            System.out.println(B[contador]);
        }

    }
}
