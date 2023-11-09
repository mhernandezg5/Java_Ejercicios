
/*
 * Construir un programa que simule el funcionamiento de una calculadora 
 * que puede realizar las cuatro operaciones aritméticas básicas 
 * (suma, resta, producto y división) con valores numéricos enteros. 
 * El usuario debe especificar la operación con el primer carácter del 
 * primer parámetro de la línea de comandos: S o s para la suma, 
 * Ro r para la resta, P, p, M o m para el producto y D o d para la división.
 */
import javax.swing.JOptionPane;

public class Ejercicio_11 {
    public static void main(String[] args) {

        double numero_1, numero_2, resultado;

        numero_1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer número"));
        numero_2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo número"));

        char opcion = JOptionPane.showInputDialog("S.s. Suma \n R.r. Resta \n M.m. Multiplicación \n D.d. Divicsión")
                .charAt(0);

        switch (opcion) {
            case 'S':
            case 's':
                resultado = numero_1 + numero_2;
                JOptionPane.showMessageDialog(null, "La  suma es " + resultado);
                break;
            case 'R':
            case 'r':
                resultado = numero_1 - numero_2;
                JOptionPane.showMessageDialog(null, "La resta es " + resultado);
                break;
            case 'M':
            case 'm':
                resultado = numero_1 * numero_2;
                JOptionPane.showMessageDialog(null, "La multiplicación es " + resultado);
                break;

            case 'D':
            case 'd':
                if (numero_2 != 0) {
                    resultado = numero_1 / numero_2;
                    JOptionPane.showMessageDialog(null, "La división es " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Beeep error!! div entre cero");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Beeeep opción inválida");
                break;

        }

    }
}
