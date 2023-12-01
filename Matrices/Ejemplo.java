package Matrices;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejemplo {
    public static void main(String[] args) {
        try (// constructor del objeto scanner
                Scanner entrada = new Scanner(System.in)) {
            int matriz[][];
            int nFilas, nColumnas;

            nFilas = Integer.parseInt(JOptionPane.showInputDialog("Número de filas: "));
            nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Número de columnas: "));

            // Constructor del objeto matriz para asignar valores
            matriz = new int[nFilas][nColumnas];

            // LLenar matriz
            for (int filas = 0; filas < nFilas; filas++) {
                for (int columnas = 0; columnas < nColumnas; columnas++) {
                    System.out.print("Pocisión [" + filas + "]" + "[" + columnas + "]: ");
                    matriz[filas][columnas] = entrada.nextInt();
                }
            }

            // Mostrar matriz
            System.out.println("\nMatriz");
            for (int i = 0; i < nFilas; i++) { // filas
                for (int j = 0; j < nColumnas; j++) { // columnas
                    System.out.print(" " + matriz[i][j]);
                }
                System.out.println();
            }
        } catch (NumberFormatException | HeadlessException e) {
            e.printStackTrace();
        }
    }
}
