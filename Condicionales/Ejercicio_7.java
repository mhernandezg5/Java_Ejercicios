
/**
 * Pedir tres números ym ostrarlos de mayor a menor
 * 1
 * 5
 * 9
 */
import javax.swing.JOptionPane;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int numero_1, numero_2, numero_3;

        numero_1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primero número"));
        numero_2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
        numero_3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número"));

        if (numero_1 > numero_2 && numero_2 > numero_3) {
            JOptionPane.showMessageDialog(null, numero_1 + " - " + numero_2 + " - " + numero_3);
        } else if (numero_1 > numero_3 && numero_3 > numero_2) {
            JOptionPane.showMessageDialog(null, numero_1 + " - " + numero_3 + " - " + numero_2);
        } else if (numero_2 > numero_1 && numero_1 > numero_3) {
            JOptionPane.showMessageDialog(null, numero_2 + " - " + numero_1 + " - " + numero_3);
        }
        /*
         * variable temporal que guarda valores
         * if (numero_1 > numero_2) {
         * int temp = numero_1;
         * numero_1 = numero_2;
         * numero_2 = temp;
         * } else if (numero_2 > numero_3) {
         * int temp = numero_2;
         * numero_2 = numero_3;
         * numero_3 = temp;
         * } else if (numero_1 > numero_2) {
         * int temp = numero_1;
         * numero_1 = numero_2;
         * numero_2 = temp;
         * }
         * JOptionPane.showMessageDialog(null,
         * "Los números ordenados de mayor a menor son: " + numero_3 + ", " + numero_2 +
         * ", " + numero_1);
         */
    }

}
