/*
 * Construir un programa que calcule el área y el perímetro 
 * de un cuadrilátero dada la longitud de sus dos lados. 
 * Los valores de la longitud deberán introducirse por 
 * línea de ordenes. Si es un cuadrado, sólo se 
 * proporcionará la longitud de uno de los lados al constructor.
 */
package Ejercicios_POO.Ejercicio_1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Solo se crea el ob jeto
        Cuadrilatero cuad;

        // Pedir los valores
        float lado_1, lado_2;

        lado_1 = Float.parseFloat(JOptionPane.showInputDialog("Primer lado: "));
        lado_2 = Float.parseFloat(JOptionPane.showInputDialog("Segundo lado: "));

        if (lado_1 == lado_2) { // es un cuadrado
            cuad = new Cuadrilatero(lado_1);
        } else {
            cuad = new Cuadrilatero(lado_1, lado_2);
        }

        System.out.print("PERÍMETRO: " + cuad.getPerimetro());
        System.out.print("\nAREA: " + cuad.getArea());
        System.out.println();

    }
}
