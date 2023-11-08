import javax.swing.JOptionPane;

public class Ejercicio_1 {
    public static void main(String[] args) {

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe número"));

        if (numero % 10 == 0) { // % es el residuo quiere decir que si es cero es un multipo exacato
            JOptionPane.showMessageDialog(null, "Es multiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "No es multiplo de 10");
        }
    }
}
