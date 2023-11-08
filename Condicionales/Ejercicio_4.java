import javax.swing.JOptionPane;

public class Ejercicio_4 {
    public static void main(String[] args) {
        double gasto, descuento, pagar;

        gasto = Integer.parseInt(JOptionPane.showInputDialog("Gasto: "));

        if (gasto > 300.00) {
            descuento = 0.20 * gasto;
            pagar = gasto - descuento;
            JOptionPane.showMessageDialog(null, pagar);
        } else {
            JOptionPane.showMessageDialog(null, "NO hay descuento: " + gasto);
        }
    }
}