package Matrices;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int[][] matrizOriginal = new int[5][9];
        int[][] matrizTranspuesta = new int[9][5];

        // Supongamos que llenamos matrizOriginal con algún valor (puedes modificar esta
        // parte)
        int valor = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matrizOriginal[i][j] = valor++;
            }
        }

        // Transponer la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz Original:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrizOriginal[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar la matriz transpuesta
        System.out.println("\nMatriz Transpuesta:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
