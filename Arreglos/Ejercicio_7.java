/*
 * Leer por teclado una serie de 10 números enteros. 
 * La aplicación debe indicarnos si los números 
 * están ordenados de forma creciente, 
 * decreciente, o si están desordenados.
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] numeros = new int[10];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print((i + 1) + ". Número: ");
                numeros[i] = entrada.nextInt();
            }
            boolean creciente = true;
            boolean decreciente = true;

            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i - 1] > numeros[i]) {
                    creciente = false;
                } else if (numeros[i - 1] < numeros[i]) {
                    decreciente = false;
                }
            }

            if (creciente) {
                System.out.println("Los números están ordenados de forma creciente.");
            } else if (decreciente) {
                System.out.println("Los números están ordenados de forma decreciente.");
            } else {
                System.out.println("Los números están desordenados.");
            }
        }
    }
}
