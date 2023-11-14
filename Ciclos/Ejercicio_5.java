/*
 * Realizar un juego para adivinar un número. Para ello generar
 * un numero aletaroroi entre 0.100 luego ir pidiende tumeros indicando 
 * "es mayor" o "es menor"   * según sea mayor o menor con respecto a N. 
 * El proceso termina  * cuando el usuario acierta y mostrar el número de intentos.
 */
package Ciclos;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Ejercicio_5 {
    public static void main(String[] args) {

        int numero_aleatorio = (int) (Math.random() * 100);
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
