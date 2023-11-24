package Ordenamiento;

import java.util.Scanner;

public class Insesion {
    public static void main(String[] args) {
        int pos, aux;
        Scanner leer = new Scanner(System.in);
        System.out.print("Tamaños del arreglo: ");
        int elementos = leer.nextInt();

        int[] numeros = new int[elementos];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Número: ");
            numeros[i] = leer.nextInt();
        }
        // Método por insesión
        for (int j = 0; j < numeros.length; j++) {
            pos = j;
            aux = numeros[j];

            while ((pos > 0) && (numeros[pos - 1] > aux)) {
                numeros[pos] = numeros[pos - 1];
                pos--;
            }
            numeros[pos] = aux;
        }

        // Mostrar arreglo
        for (int k = 0; k < numeros.length; k++) {
            System.out.print(numeros[k] + "  ");
        }
    }
}