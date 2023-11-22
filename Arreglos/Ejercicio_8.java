/*
 * Diseñar una aplicación que declare una tabla 
 * de 10 elementos enteros. Leer mediante el 
 * teclado 8 números. Después se debe pedir 
 * un número y una posición, insertarlo en la 
 * posición indicada, desplazando los que estén detrás.
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        try (Scanner entrada = new Scanner(System.in)) {
            // Leer 8 números por teclado
            System.out.println("Ingrese 8 números:");
            for (int i = 0; i < 8; i++) {
                numeros[i] = entrada.nextInt();
            }

            // Mostrar el arreglo original
            System.out.println("Arreglo original:");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Pedir un número y una posición
            System.out.print("Ingrese un número a insertar: ");
            int numeroInsertar = entrada.nextInt();
            System.out.print("Ingrese la posición donde desea insertarlo (de 0 a 9): ");
            int posicion = entrada.nextInt();

            // Verificar la validez de la posición
            if (posicion < 0 || posicion > 9) {
                System.out.println("Posición inválida. Debe ser entre 0 y 9.");
            } else {
                // Desplazar elementos hacia la derecha
                for (int i = 8; i >= posicion; i--) {
                    numeros[i + 1] = numeros[i];
                }

                // Insertar el número en la posición indicada
                numeros[posicion] = numeroInsertar;

                // Mostrar el arreglo modificado
                System.out.println("Arreglo modificado:");
                for (int num : numeros) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
