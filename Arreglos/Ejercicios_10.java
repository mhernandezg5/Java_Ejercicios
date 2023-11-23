/*
 * Crear un programa que lea por teclado una tabla 
 * de 10 números enteros y desplace N posiciones 
 * en el arreglo (N es digitado por el usuario).
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicios_10 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        Scanner entrada = new Scanner(System.in);
        System.out.println("ARREGLO");
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.print((contador + 1) + ". Numero: ");
            numeros[contador] = entrada.nextInt();
        }
        // Pedir el número de posiciones a desplazar
        System.out.print("Ingrese la cantidad de posiciones a desplazar: ");
        int n = entrada.nextInt();

        // Crear un nuevo arreglo para almacenar el resultado del desplazamiento
        int[] numerosDesplazados = new int[numeros.length];

        // Realizar el desplazamiento de los elementos
        for (int i = 0; i < numeros.length; i++) {
            int nuevaPosicion = (i + n) % numeros.length;
            numerosDesplazados[nuevaPosicion] = numeros[i];
        }

        // Imprimir el arreglo con los elementos desplazados
        System.out.println("Arreglo con elementos desplazados:");
        for (int i : numerosDesplazados) {
            System.out.print(i + " ");
        }
    }
}
