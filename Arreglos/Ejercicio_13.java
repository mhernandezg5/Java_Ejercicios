/*
 * Leer 10 enteros en una tabla. 
 * Guardar en otra tabla los elementos 
 * pares de la primera, 
 * y a continuación los elementos impares.
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int[] numeros = new int[10];
            int[] pares = new int[10]; // Arreglo para números pares
            int[] impares = new int[10]; // Arreglo para números impares
            int i_Pares = 0; // Contador para mantener el índice de pares
            int i_Impares = 0; // Contador para mantener el índice de impares

            for (int i = 0; i < numeros.length; i++) {
                System.out.print((i + 1) + ". Número: ");
                numeros[i] = leer.nextInt();

                if (numeros[i] % 2 == 0) {
                    pares[i_Pares] = numeros[i];
                    i_Pares++;
                } else {
                    impares[i_Impares] = numeros[i];
                    i_Impares++;
                }
            }

            // Mostrar números pares
            System.out.println("Números pares:");
            for (int j = 0; j < i_Pares; j++) {
                System.out.print(pares[j] + " ");
            }

            // Mostrar números impares
            System.out.println("\nNúmeros impares:");
            for (int k = 0; k < i_Impares; k++) {
                System.out.print(impares[k] + " ");
            }
        }
    }
}