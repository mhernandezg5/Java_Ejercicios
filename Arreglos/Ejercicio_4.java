/*
 * Leer 10 números enteros, guardarlos en un arreglo. 
 * Debemos mostrarlos en el siguiente orden: el primero, 
 * el último, el segundo, el penúltimo, el tercero, etc.
 */
package Arreglos;

import javax.swing.JOptionPane;

public class Ejercicio_4 {

	public static void main(String[] args) {
		int[] numeros = new int[10];

		for (int contador = 0; contador < numeros.length; contador++) {
			numeros[contador] = Integer.parseInt(JOptionPane.showInputDialog("Números: "));

		}
		for (int contador_2 = 0; contador_2 < numeros.length / 2; contador_2++) {
			System.out.println(numeros[contador_2]);
			System.out.println(numeros[numeros.length - 1 - contador_2]); // Inicia al final del tamaño del arreglo y va
																																		// restando al indice para mostrar el valor que
																																		// tiene la posición

		}

	}
}
