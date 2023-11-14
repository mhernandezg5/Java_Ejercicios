/*
 * Pedir números hasta que se teclee uno negativo
 * y mostrar cuántos números se han introducido.
 */
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        while (numero >= 0) {
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            System.out.println(contador);
        }

        JOptionPane.showMessageDialog(null, "Se han introducido " + contador + "veces");
    }
}
