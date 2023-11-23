/*
 * Sección de ejemplos
 */
package Arreglos;

public class Ejemplos_0 {

  public static void main(String[] args) {
    int[] A = new int[5];
    int[] B = new int[10];

    int[] C = new int[15];

    // Llenar el arreglo con el ciclo
    int contador_A = 0;
    for (contador_A = 0; contador_A < A.length; contador_A++) {
      A[contador_A] = contador_A;
    }
    // Llenar el arreglo con el ciclo
    int contador_B = 0;
    for (contador_B = 0; contador_B < B.length; contador_B++) {
      B[contador_B] = contador_B;
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