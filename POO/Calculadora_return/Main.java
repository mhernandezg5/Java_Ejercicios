package POO.Calculadora_return;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (// PEdir los números
                Scanner entrada = new Scanner(System.in)) {
            System.out.print("Número 1: ");
            int numero1 = entrada.nextInt();
            System.out.print("Número 2: ");
            int numero2 = entrada.nextInt();

            // Objeto de la clase
            Operaciones opera = new Operaciones();

            // Instancia de los métodos
            int suma = opera.sumar(numero1, numero2);
            int resta = opera.restar(numero1, numero2);
            int multiplicacion = opera.multiplicar(numero1, numero2);
            int division = opera.dividir(numero1, numero2);

            // Imprimir valores se pasan los argumentos de las viarables de los objetos
            // para que el método tome los parámetros y muestre los valores
            opera.imprimir(suma, resta, multiplicacion, division);
        }

    }
}
