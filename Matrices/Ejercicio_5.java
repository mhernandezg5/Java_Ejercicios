package Matrices;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Obtener el tamaño de la matriz
        System.out.print("Ingrese el número de filas: ");
        int filas = entrada.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = entrada.nextInt();

        int[][] matriz = new int[filas][columnas];

        // Cargar la matriz
        System.out.println("Ingrese los valores para la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Mostrar la matriz
        System.out.println("\nMatriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calcular y mostrar la suma de cada fila
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        // Calcular y mostrar la suma de cada columna
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
        }

        entrada.close();
    }
}
