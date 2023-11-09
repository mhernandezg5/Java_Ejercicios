
/*
 * Pedir un numero entre 0 y 999
 * decir cuantas 0, 99 0 999
 * cifras tiene, una, dos o tres
 */
import javax.swing.JOptionPane;

public class Ejercicio_8 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entre 0 y 999"));

        // de una cifra
        if (numero >= 0 && numero <= 9) {
            JOptionPane.showMessageDialog(null, "Número de una cifra  " + numero);
        } else if (numero >= 10 && numero <= 99) {
            JOptionPane.showMessageDialog(null, "Númer de dos cifras  " + numero);
        } else if (numero >= 100 && numero <= 999) {
            JOptionPane.showMessageDialog(null, "Número de tres cifras  " + numero);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR NÚMERO INVÁLIDO");
        }

    }
}
