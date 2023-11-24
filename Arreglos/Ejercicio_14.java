/*
 * Leer dos series de 10 enteros, que estarán 
 * ordenados crecientemente. Copiar (fusionar) 
 * las dos tablas en una tercera, de forma que sigan ordenados.
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];

        int[] C = new int[20];

        try (Scanner leer = new Scanner(System.in)) {
            // Llenar el arreglo
            int contador_A = 0;
            for (contador_A = 0; contador_A < A.length; contador_A++) {
                System.out.print((contador_A + 1) + ". A - ARREGLO: ");
                A[contador_A] = leer.nextInt();
            }
            // Llenar el arreglo
            int contador_B = 0;
            for (contador_B = 0; contador_B < B.length; contador_B++) {
                System.out.print((contador_B + 1) + ". B - ARREGLO: ");
                B[contador_B] = leer.nextInt();
            }
        }

        // recorrido general del arreglo C
        int contador_C = 0;
        for (contador_C = 0; contador_C < A.length; contador_C++) {
            // Agrega los valores de los indices de A en los indices de C
            C[contador_C] = A[contador_C];
        }

        int contador_D = 0;
        for (contador_D = 0; contador_D < B.length; contador_D++) {
            // Agrega los valores de los indices de B en los indices de C
            // Toma de valor inicial el indice del tamaño del arreglo A
            // Porque ya se llenó C con este tamaño
            C[A.length + contador_D] = B[contador_D];
        }

        for (int i : C) {
            System.out.print(i + "  ");
        }
    }
}
