package POO.Calculadora_Poo;

import javax.swing.JOptionPane;

public class Operacion {
    int numero_1, numero_2, suma, resta, multiplicacion, division;

    public void entrada() {
        numero_1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
        numero_2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));
    }

    public void sumar() {
        suma = numero_1 + numero_2;
    }

    public void restar() {
        resta = numero_1 - numero_2;
    }

    public void multiplicar() {
        multiplicacion = numero_1 * numero_2;
    }

    public void dividir() {
        division = numero_1 / numero_2;
    }

    public void mostrar() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
