package POO.Calculadora_return;

public class Operaciones {
    // sumar
    public int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    // restar
    public int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }

    // Multiplicación
    public int multiplicar(int numero1, int numero2) {
        int multi = numero1 * numero2;
        return multi;
    }

    // División
    public int dividir(int numero1, int numero2) {
        int divi = numero1 / numero2;
        return divi;
    }

    // Imprimir en patanlla
    public void imprimir(int suma, int resta, int multiplicacion, int division) {
        System.out.println("\nSUMA: " + suma);
        System.out.println("RESTA: " + resta);
        System.out.println("MULTIPLICACIÓN: " + multiplicacion);
        System.out.println("DIVISIÓN: " + division);
    }
}
