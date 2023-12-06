package POO.Calculadora_pararg;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Operaciones ope = new Operaciones();

        int n_1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1: "));
        int n_2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2: "));

        // SE pasan los argumentos con el objeto
        // El método lo recibe como parámetros
        // Acá se instancian los métodos y se envián los argumentos
        ope.sumando(n_1, n_2);
        ope.restando(n_1, n_2);
        ope.multiplicando(n_1, n_2);
        ope.dividiendo(n_1, n_2);

        ope.mostrar();

    }
}
