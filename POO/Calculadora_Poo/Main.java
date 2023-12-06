package POO.Calculadora_Poo;

public class Main {
    public static void main(String[] args) {
        // Constructor del objeto para la clase Operacion
        Operacion op = new Operacion();

        // Instancias de métodos dentro de la case
        op.entrada();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrar();

    }
}
