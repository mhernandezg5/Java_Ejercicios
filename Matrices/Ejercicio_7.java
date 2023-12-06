package Matrices;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Llenar bordes con 1
        for (int i = 0; i < 5; i++) {
            matriz[0][i] = 1; // Primer fila
            matriz[4][i] = 1; // Última fila
            matriz[i][0] = 1; // Primera columna
            matriz[i][4] = 1; // Última columna
        }

        // Mostrar la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
