
/*
 * Hacer un programa que simule un cajero automático con 
 * un saldo inicial de 1000 Dólares, con el siguiente menú 
 * de opciones:
1. Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta
3. Salir
 */
import javax.swing.JOptionPane;

public class Ejercicio_13 {
    public static void main(String[] args) {
        float saldo = 1000, dinero, retiro;

        int opciones = Integer.parseInt(JOptionPane
                .showInputDialog("1. Ingresar dinero a la cuenta \n 2. Retirar dinero de la cuenta \n 3. Salir"));

        switch (opciones) {
            case 1:
                dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar dinero"));
                dinero = saldo + dinero;
                JOptionPane.showMessageDialog(null, "Saldo actual $. " + dinero);
                break;
            case 2:
                retiro = Integer.parseInt(JOptionPane.showInputDialog("Retirar dinero"));
                if (retiro <= saldo) {
                    dinero = saldo - retiro;
                    JOptionPane.showMessageDialog(null, "Saldo actual $. " + dinero);
                } else {
                    JOptionPane.showMessageDialog(null, "Beep no hay dinero trabaje");
                }
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break;
        }

        /*
         * if (opciones == 1) {
         * dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar dinero"));
         * dinero = saldo + dinero;
         * JOptionPane.showMessageDialog(null, "Saldo actual $. " + dinero);
         * }
         */
    }
}
