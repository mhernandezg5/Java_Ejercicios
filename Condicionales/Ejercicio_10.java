
/*
 * día mes y año correctos
 * meses de 28, 30 y 31 días
 * sin años bisiestos
 */
import javax.swing.JOptionPane;

public class Ejercicio_10 {
    public static void main(String[] args) {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));

        if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (anio > 0)) {
            JOptionPane.showMessageDialog(null, "Fecha correcta  " + dia + " - " + mes + " - " + anio);
        } else {
            JOptionPane.showMessageDialog(null, "Beeeeeeeep fecha incorrecta");
        }
    }

}
