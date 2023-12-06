package POO.Calculadora_pararg;

public class Operaciones {
    int sum, res, mult, div;

    public void sumando(int num_1, int num_2) {
        sum = num_1 + num_2;
    }

    public void restando(int num_1, int num_2) {
        res = num_1 - num_2;
    }

    public void multiplicando(int num_1, int num_2) {
        mult = num_1 * num_2;
    }

    public void dividiendo(int num_1, int num_2) {
        div = num_1 / num_2;
    }

    public void mostrar() {
        System.out.println("SUMA: " + sum);
        System.out.println("Resta: " + res);
        System.out.println("Division: " + div);
        System.out.println("Multiplicacion: " + mult);
    }

}
