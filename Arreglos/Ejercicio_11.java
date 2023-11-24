/*
 * Leer 5 elementos numéricos que se introducirán 
 * ordenados de forma creciente. Éstos los guardaremos 
 * en una tabla de tamaño 10. Leer un número N, 
 * e insertarlo en el lugar adecuado para que la 
 * tabla continúe ordenada.
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int[] numeros = new int[10];

            System.out.println("Introduce 5 números ordenados de forma creciente:");
            for (int contador = 0; contador < 5; contador++) {
                numeros[contador] = entrada.nextInt();
            }

            System.out.println("Introduce un número para insertar:");
            int numeroAInsertar = entrada.nextInt();

            // Insertar el nuevo número y ordenar el arreglo
            int indiceInsercion = 5; // El índice donde se insertará el nuevo número
            for (int i = 4; i >= 0; i--) {
                if (numeros[i] > numeroAInsertar) {
                    numeros[i + 1] = numeros[i];
                    indiceInsercion = i;
                } else {
                    System.out.println("Error en la secuencia");
                    
                }
            }
            numeros[indiceInsercion] = numeroAInsertar;

            // Mostrar el arreglo con el número insertado y ordenado
            System.out.println("Arreglo con el número insertado y ordenado:");
            for (int i = 0; i < 6; i++) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
