import javax.swing.JOptionPane;

public class Ejercicio_2 {

    public static void main(String[] args) {
        // pedir dos numeros y decir cual es el mayor o si son iguales
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "El " + numero1 + " es mayor");
        } else if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "El " + numero2 + " es mayor");
        } else {
            JOptionPane.showMessageDialog(null, "Los numeros " + numero1 + " y " + numero2 + " son iguales");
        }
    }
}