
/*
 * Pedir una fecha, día, mes y año
 * determinar si es correcta
 * suponiendo que todos los meses
 * tienen 30 días dd/mm/aa
 */
import javax.swing.JOptionPane;

public class Ejercicio_9 {
    public static void main(String[] args) {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));

        if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (anio > 0)) {
            JOptionPane.showMessageDialog(null, "Fecha correcta  " + dia + " - " + mes + " - " + anio);
        } else {
            JOptionPane.showMessageDialog(null, "Beeeeeeeep fecha incorrecta");
        }
    }
}
