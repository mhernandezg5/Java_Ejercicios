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
        int[] A = new int[12];
        int[] B = new int[12];
        // Pedir y llenar el primer arreglo A
        for (int contador_A = 0; contador_A < A.length; contador_A++) {
            A[contador_A] = Integer
                    .parseInt(JOptionPane.showInputDialog("Arreglo A: " + (contador_A + 1) + ":"));
        }

        // Pedir y llenar el segundo arreglo B
        for (int contador_B = 0; contador_B < B.length; contador_B++) {
            B[contador_B] = Integer
                    .parseInt(JOptionPane.showInputDialog("Arreglo B: " + (contador_B + 1) + ":"));
        }

        int[] C = new int[24]; // Arreglo C para mezclar A y B
        int contador_C = 0; // Índice para el arreglo C

        // Combinar los elementos de A y B en el arreglo C
        for (int i = 0; i < 12; i += 3) {

            // Agregar 3 elementos de A a C
            for (int j = 0; j < 3; j++) {
                C[contador_C] = A[i + j];
                contador_C++;
            }

            // Agregar 3 elementos de B a C
            for (int j = 0; j < 3; j++) {
                C[contador_C] = B[i + j];
                contador_C++;
            }
        }

        // Mostrar el arreglo resultante C
        System.out.println("Arreglo resultante C:");
        for (int elemento : C) {
            System.out.print(elemento + " ");
        }
    }
}
