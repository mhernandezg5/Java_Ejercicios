package Matrices;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] suma = new int[3][3];

        Scanner entrada = new Scanner(System.in);

        // Cargar la primera matriz
        System.out.println("Ingrese los valores para la primera matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz1 [" + i + "][" + j + "]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        // Cargar la segunda matriz
        System.out.println("Ingrese los valores para la segunda matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz2 [" + i + "][" + j + "]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        // Sumar las matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Mostrar la suma de las matrices
        System.out.println("La suma de las matrices es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
