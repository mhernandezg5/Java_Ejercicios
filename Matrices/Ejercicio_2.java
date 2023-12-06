package Matrices;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] suma = new int[3][3];

        try (Scanner entrada = new Scanner(System.in)) {
            // Cargar la primera matriz
            System.out.println("Ingrese los valores para la primera matriz:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Matriz1 [" + i + "][" + j + "]: ");
                    A[i][j] = entrada.nextInt();
                }
            }

            // Cargar la segunda matriz
            System.out.println("Ingrese los valores para la segunda matriz:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Matriz2 [" + i + "][" + j + "]: ");
                    B[i][j] = entrada.nextInt();
                }
            }
        }

        // Sumar las matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = A[i][j] + B[i][j];
            }
        }

        // Mostrar la suma de las matrices
        System.out.println("La suma de las matrices es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
