/*
 * Crea y carga un matriz de tamaño nxm
 * y decir si es simétrica o no
 */
package Matrices;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // Definir matriz
        int matriz[][];
        int filas, columnas;
        boolean simetrica = true; // comprueba si la matriz es simétrica o cambia en algún punto

        // Pedir valores
        filas = Integer.parseInt(JOptionPane.showInputDialog("Filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Columnas"));
        try (// pedir valores de filas y columnas
                Scanner entrada = new Scanner(System.in)) {
            matriz = new int[filas][columnas];
            for (int f = 0; f < filas; f++) { // recorrer filas
                for (int c = 0; c < columnas; c++) {
                    System.out.print("Matriz [" + f + "][" + c + "]: ");
                    matriz[f][c] = entrada.nextInt();
                }
            }
        }
        // Mostrar la matriz
        System.out.println("\nMATRIZ");
        for (int i = 0; i < filas; i++) { // Recorre las filas
            for (int j = 0; j < columnas; j++) { // Recorre las columnas
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }
        // Validar si es simetrica o no
        if (filas == columnas) { // Es cuadrada es decir de 2x2, 3x3 etc
            int i = 0, j = 0;

            for (i = 0; i < filas; i++) {
                for (j = 0; j < columnas; j++) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                        break;
                    }
                }
                if (!simetrica) {
                    break;
                }
            }

            if (simetrica == true) {
                System.out.println("La matriz es SIMETRICA");

            } else {
                System.out.println("La matriz NO ES SIMETRICA");
            }

        } else {
            System.out.println("La matriz no es SIMETRICA");
        }

    }
}