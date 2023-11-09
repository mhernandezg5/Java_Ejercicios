/*
 * insuficiente 0 - 4
 * suficiente 5 aprobado
 * Bien 6
 * Notable 7 - 8
 * Sobresaliente 9-10
 */

import javax.swing.JOptionPane;

public class Ejercicio_12 {
    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Escriba la nota entre 0 y 10 puntos "));

        if (nota >= 0 && nota <= 4) {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        } else if (nota == 5) {
            JOptionPane.showMessageDialog(null, "Aprobado");
        } else if (nota == 6) {
            JOptionPane.showMessageDialog(null, "Bien");
        } else if (nota >= 7 && nota <= 8) {
            JOptionPane.showMessageDialog(null, "Notable");
        } else if (nota >= 9 && nota <= 10) {
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        } else {
            JOptionPane.showMessageDialog(null, "Beeeep nota incorrecta");
        }

    }
}