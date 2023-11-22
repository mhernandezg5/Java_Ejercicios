/*
 * Leer los datos  correspondiente a dos tablas 
 * de 12  elementos numéricos, 
 * y mezclarlos en una tercera de la forma: 
 * 3 de la tabla A, 
 * 3 de la B, otros 
 * 3 de A, otros 
 * 3 de la B, etc
 */
package Arreglos;

import javax.swing.JOptionPane;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        // Pedir y llenar el primer arreglo A
        for (int contador = 0; contador < A.length; contador++) {
            A[contador] = Integer.parseInt(JOptionPane.showInputDialog(contador + 1 + ". Número: "));
        }

        // Pedir y llenar el segundo arreglo B
        for (int contador_1 = 0; contador_1 < B.length; contador_1++) {
            B[contador_1] = Integer.parseInt(JOptionPane.showInputDialog(contador_1 + 1 + ". Número: "));
        }
    }
}
