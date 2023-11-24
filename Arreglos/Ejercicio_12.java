/*
 * Leer por teclado una tabla de 10 elementos 
 * numéricos enteros y una posición (entre 0 y 9). 
 * Eliminar el elemento situado en la 
 * posición dada sin dejar huecos.
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {

        int[] enteros = new int[10];
        try (Scanner entrada = new Scanner(System.in)) {
            for (int i = 0; i < enteros.length; i++) {
                System.out.print((i + 1) + ". Entero: ");
                enteros[i] = entrada.nextInt();
            }

            System.out.println("Ingrese la posición a eliminar (entre 0 y 9):");
            int indice_eliminar = entrada.nextInt();

            if (indice_eliminar < 0 || indice_eliminar >= enteros.length) {
                System.out.println("Posición inválida. Debe estar entre 0 y 9.");
            } else {
                // Eliminar elemento en la posición dada
                for (int i = indice_eliminar; i < enteros.length - 1; i++) {
                    enteros[i] = enteros[i + 1];
                }
                enteros[enteros.length - 1] = 0; // Opcional: Último elemento se establece a 0
                System.out.println("Elemento eliminado correctamente.");

                // Mostrar el arreglo actualizado
                System.out.println("Arreglo actualizado:");
                for (int entero : enteros) {
                    System.out.print(entero + " ");
                }
            }
        }
    }
}
