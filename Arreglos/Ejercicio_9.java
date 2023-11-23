/*
 * Crear un programa que lea por teclado una tabla de 1
 * 0 números enteros y la desplace una posición hacia abajo: 
 * el primero pasa a ser el segundo, 
 * el segundo pasa a ser el tercero y así sucesivamente. 
 * El último pasa a ser el primero.
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] numeros = new int[10];

            // Leer 10 números por teclado
            System.out.println("Ingrese 10 números enteros:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print((i + 1) + ". Número: ");
                numeros[i] = entrada.nextInt();
            }

            // Guardar el último número
            int ultimo = numeros[numeros.length - 1];

            // Desplazar los números una posición hacia abajo
            for (int i = numeros.length - 1; i > 0; i--) {
                numeros[i] = numeros[i - 1];
            }

            // Asignar el último número al primer índice
            numeros[0] = ultimo;

            // Mostrar la tabla desplazada hacia abajo
            System.out.println("Tabla desplazada hacia abajo:");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
