/*hacer un programa que tome dos numeros y diga
si ambos son pares o impartes
 */

import javax.swing.JOptionPane;

public class Ejercicio_6 {
    public static void main(String[] args) {

        int numero_1, numero_2;

        numero_1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer número"));
        numero_2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo número"));

        if ((numero_1 % 2 == 0) && (numero_2 % 2 == 0)) {
            JOptionPane.showMessageDialog(null, "Ambos son pares");
        } else if ((numero_1 % 2 != 0) && (numero_2 != 0)) {
            JOptionPane.showMessageDialog(null, "No son pares");
        } else {
            JOptionPane.showMessageDialog(null, "Uno es par y otro impar");
        }
    }
}
