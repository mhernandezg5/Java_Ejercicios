package Ejercicios_POO.Ejercicio_4;

import java.util.Scanner;

public class Principal {

    public static int indiceGanador(Atleta atletas[]) {
        float tiempo_Carrera;
        int indice = 0;

        tiempo_Carrera = atletas[indice].getTiempo_Carrera();

        // Se obtien el tiempo menor del atebla que ganará
        for (int i = 1; i < atletas.length; i++) {
            if (atletas[i].getTiempo_Carrera() < tiempo_Carrera) {
                tiempo_Carrera = atletas[i].getTiempo_Carrera();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int no_atleta, participantes, ganador;
        float tiempo_Carrera;

        // Pedir la cantidad de atletas que van a participar
        System.out.print("Ateltas a participar: ");
        participantes = entrada.nextInt();

        // Arreglo de objetos
        Atleta atletas[] = new Atleta[participantes];

        for (int iterador = 0; iterador < atletas.length; iterador++) {

            System.out.println("Atleta # " + (iterador + 1));

            System.out.println("No. Atleta: ");
            no_atleta = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Tiempo: ");
            tiempo_Carrera = entrada.nextFloat();

            atletas[iterador] = new Atleta(no_atleta, nombre, tiempo_Carrera);
        }
        ganador = indiceGanador(atletas);
        System.out.println("EL GANADOR ES: " + atletas[ganador].mostrarGanador());

    }

}
