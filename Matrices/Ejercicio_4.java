/*
 * Crear una matriz de tamaño 7x7 rellanarla 
 * de forma que los elementos de la diagnoal 
 * prnicpal sean 1 y el resto 0
 */
package Matrices;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];

        // Rellenar la matriz con 1 en la diagonal principal y 0 en el resto
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("MATRIZ DIAGNOAL");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
