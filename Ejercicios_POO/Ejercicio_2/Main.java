package Ejercicios_POO.Ejercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Constructor de la clase, sin llamar al bojeto
        Plano P1;

        try (// Perdir coordenadas al usuario
                Scanner entrada = new Scanner(System.in)) {
            int x, y, opcion, incremento = 0;

            System.out.print("Coordenada X: ");
            x = entrada.nextInt();
            System.out.print("Coordenada Y: ");
            y = entrada.nextInt();

            // Pocisición inicial
            P1 = new Plano(x, y);

            // Menú para mover el objeto
            do {
                System.out.println("\n\tMENÚ");
                System.out.println("1. Mover hacia ARRIBA");
                System.out.println("2. Mover hacia ABAJO");
                System.out.println("3. Mover hacia la DERECHA");
                System.out.println("4. Mover hacia la IZQUIERDA");
                System.out.println("5. SALIR");
                System.out.print("Digita la opción:  ");
                opcion = entrada.nextInt();

                System.out.println();

                if (opcion > 0 && opcion < 6) {
                    System.out.print("Digite la cantidad de puntos: ");
                    incremento = entrada.nextInt();
                }
                switch (opcion) {
                    case 1:
                        P1.mover_Arriba(incremento);
                        break;
                    case 2:
                        P1.mover_Abajo(incremento);
                        break;
                    case 3:
                        P1.mover_Derecha(incremento);
                        break;
                    case 4:
                        P1.mover_Izquierda(incremento);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("ERROR! Opción inválida");
                        break;
                }
                System.out.println();
                System.out.println("Coordinadea (X, Y): (" + P1.getX() + ", " + P1.getY() + ")");

            } while (opcion != 5);
        }

    }
}
