package Ejercicios_POO.Ejercicio_3;

import java.util.Scanner;

public class Main {
    // método para obeneter el precio mas bajo
    public static int indiceCarroBarato(Vehiculo carros[]) {
        float precio;
        int indice = 0;

        precio = carros[0].getPrecio();

        for (int i = 1; i < carros.length; i++) {
            if (carros[i].getPrecio() < precio) {
                precio = carros[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {

        // Leer datos del teclado

        try (Scanner entrada = new Scanner(System.in)) {
            String marca, modelo;
            float precio;
            int numero_vehiculos, indiceBarato;

            System.out.print("¿Cuántos carros quieres guardar?: ");
            numero_vehiculos = entrada.nextInt();

            // Guardar la cantidad de vehiculos en un array
            // Objetos para los carros
            Vehiculo carros[] = new Vehiculo[numero_vehiculos];

            // Meter los valores de los carros
            for (int iterador = 0; iterador < carros.length; iterador++) {
                entrada.nextLine();
                System.out.println("\nCARRO # " + (iterador + 1) + ": ");
                System.out.print("Marca: ");
                marca = entrada.nextLine();
                System.out.print("Modelo: ");
                modelo = entrada.nextLine();
                System.out.print("Precio: ");
                precio = entrada.nextFloat();

                // Guardar en los índices del arreglo para cada objeto
                carros[iterador] = new Vehiculo(marca, modelo, precio);

            }

            indiceBarato = indiceCarroBarato(carros);

            System.out.println("\nEl carro más barato es: " + carros[indiceBarato].mostrarDatos());
        }

    }
}
