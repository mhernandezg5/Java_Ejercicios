/*
 * Realizar un juego para adivinar un número. Para ello generar
 * un numero aletaroroi entre 0.100 luego ir pidiende tumeros indicando 
 * "es mayor" o "es menor"   * según sea mayor o menor con respecto a N. 
 * El proceso termina  * cuando el usuario acierta y mostrar el número de intentos.
 */
package Ciclos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio_5 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Random
        Random numero = new Random();

        int minimo = 0, maximo = 100;
        int numero_aleatorio = numero.nextInt(maximo - minimo + 1) + minimo;
        System.out.println(numero_aleatorio);

        int leer_numero;
        do {
            leer_numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número "));
            if (leer_numero > numero_aleatorio) {
                JOptionPane.showMessageDialog(null, leer_numero + " es mayor");
            } else if (leer_numero < numero_aleatorio) {
                JOptionPane.showMessageDialog(null, leer_numero + " es menor");
            } else if (leer_numero == numero_aleatorio) {
                JOptionPane.showMessageDialog(null, leer_numero + " es igual a " + numero_aleatorio);
            }

        } while (leer_numero != numero_aleatorio);

    }
}
