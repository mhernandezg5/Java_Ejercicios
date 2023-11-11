package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número"));
        int resultado;

        while (numero >= 0) {
            // La potencia devuelve un tipo double entonces init trunca ese valor y dal
            // entero
            resultado = (int) Math.pow(numero, 2);

            // Mujestra el valor con su potencia
            JOptionPane.showMessageDialog(null, "La potencia de " + numero + " es " + resultado);

            // Pide ingresar otro número
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribre otro número"));
        }
    }
}