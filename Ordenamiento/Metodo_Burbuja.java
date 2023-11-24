package Ordenamiento;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Metodo_Burbuja {
    public static void main(String[] args) {
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo"));
        int auxiliar;
        int[] arreglo = new int[elementos];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ". Número: ");
            arreglo[i] = leer.nextInt();
        }

        // Método si actual > siguiente (CAMBIAR)
        // controla el recorrido general
        for (int j = 0; j < arreglo.length - 1; j++) {
            // Controla los recorridos unitarios en cada índice
            for (int k = 0; k < arreglo.length - 1; k++) {
                // 8 1
                if (arreglo[k] > arreglo[k + 1]) {
                    auxiliar = arreglo[k];
                    arreglo[k] = arreglo[k + 1];
                    arreglo[k + 1] = auxiliar;
                }
            }

        }
        System.out.println();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
