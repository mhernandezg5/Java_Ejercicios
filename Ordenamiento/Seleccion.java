package Ordenamiento;

import java.util.Scanner;

public class Seleccion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tamaño del arreglo: ");
        int tamanio = entrada.nextInt();
        int[] numeros = new int[tamanio];
        int min, aux;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Número: ");
            numeros[i] = entrada.nextInt();
        }
        // Método de ordenamiento por selección
        for (int i = 0; i < tamanio; i++) {
            min = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (numeros[j] < numeros[min]) {
                    min = j;
                }
            }
            // Se intercambian los valores del índice
            aux = numeros[i];
            numeros[i] = numeros[min];
            numeros[min] = aux;

        }
        System.out.println("Orden por selección");
        for (int i : numeros) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

}
