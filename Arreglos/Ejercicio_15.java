package Arreglos;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int[] numeros = new int[10];

            // Leer los 10 enteros ordenados
            System.out.println("Ingrese 10 enteros ordenados crecientemente:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print((i + 1) + ". Número: ");
                numeros[i] = leer.nextInt();
            }

            // Leer el número a buscar
            System.out.print("Número a buscar: ");
            int numBuscar = leer.nextInt();

            // Realizar la búsqueda lineal
            int posicion = -1;
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numBuscar) {
                    posicion = i;
                }
            }

            // Mostrar el resultado
            if (posicion != -1) {
                System.out.println("El número " + numBuscar + " se encuentra en la posición " + posicion);
            } else {
                System.out.println("El número " + numBuscar + " no se encuentra en la tabla.");
            }
        }
    }
}
