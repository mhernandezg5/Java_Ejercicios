/*
 * Queremos desarrollar una aplicación que nos ayude 
 * a gestionar las notas de un centro educativo. 
 * Cada grupo (o clase) está compuesto por 5 alumnos. 
 * Se pide leer las notas del primer, segundo y tercer 
 * trimestre de un grupo. Debemos mostrar al final: 
 * la nota media del grupo en cada trimestre, y 
 * la media del alumno que se encuentra en la posición N (N se lee
por teclado).
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] notas = new double[15]; // Arreglo para almacenar las notas de 15 alumnos en 3 trimestres

            // Leer las notas de cada alumno en cada trimestre
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Alumno " + (i / 3 + 1) + ", Trimestre " + (i % 3 + 1) + ":");
                System.out.print("Ingrese la nota: ");
                notas[i] = scanner.nextDouble();
            }

            // Calcular la nota media del grupo en cada trimestre
            double[] mediasTrimestrales = new double[3];
            for (int trimestre = 0; trimestre < 3; trimestre++) {
                double suma = 0;
                for (int alumno = trimestre; alumno < notas.length; alumno += 3) {
                    suma += notas[alumno];
                }
                mediasTrimestrales[trimestre] = suma / 5; // Promedio del trimestre para 5 alumnos
                System.out.println("La nota media del grupo en el trimestre " + (trimestre + 1) + " es: "
                        + mediasTrimestrales[trimestre]);
            }

            // Calcular la media del alumno en la posición N
            System.out.print("Ingrese la posición del alumno para calcular su media (de 1 a 5): ");
            int posicionAlumno = scanner.nextInt();
            if (posicionAlumno < 1 || posicionAlumno > 5) {
                System.out.println("Posición inválida. Debe estar entre 1 y 5.");
            } else {
                double sumaAlumno = 0;
                for (int trimestre = 0; trimestre < 3; trimestre++) {
                    sumaAlumno += notas[(posicionAlumno - 1) * 3 + trimestre];
                }
                double mediaAlumno = sumaAlumno / 3;
                System.out.println("La media del alumno en la posición " + posicionAlumno + " es: " + mediaAlumno);
            }
        }
    }
}
