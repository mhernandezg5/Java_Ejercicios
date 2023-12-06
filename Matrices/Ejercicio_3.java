/*
 * crear y cargar una matriz de tamaño 3x3 transponerla y mostrarlas
 */
package Matrices;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matrizTranspuesta = new int[3][3];

        try (Scanner entrada = new Scanner(System.in)) {
            // Cargar la matriz original
            System.out.println("Ingrese los valores para la matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Matriz[" + i + "][" + j + "]: ");
                    matriz[i][j] = entrada.nextInt();
                }
            }
        }

        // Mostrar la matriz original
        System.out.println("\nMatriz Original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Transponer la matriz
        System.out.println("\nMatriz Transpuesta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTranspuesta[i][j] = matriz[j][i];
                System.out.print(matrizTranspuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
