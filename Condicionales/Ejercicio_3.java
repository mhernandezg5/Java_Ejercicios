
// pedir una letra y decir si es mayúsucla o minúscula
import javax.swing.JOptionPane;

public class Ejercicio_3 {
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Escriba una letra:  ").charAt(0);

        if (Character.isUpperCase(letra)) { // Upper indica que es mayúsucal , Charactere toma la variable Char para la
                                            // condición
            JOptionPane.showMessageDialog(null, "La letra es mayúscula");
        } else {
            JOptionPane.showMessageDialog(null, "La letra es minúscula");
        }
    }
}
