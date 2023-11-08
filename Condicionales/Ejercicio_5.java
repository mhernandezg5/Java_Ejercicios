import javax.swing.JOptionPane;

public class Ejercicio_5 {
    public static void main(String[] args) {

        double horas;
        horas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas"));

        if (horas <= 40) {
            horas = horas * 16;

        } else {
            horas = ((40 * 16) + ((horas - 40) * 20));
        }
        JOptionPane.showMessageDialog(null, "Salario total " + horas);
    }
}
