
/*
 * día mes y año correctos
 * meses de 28, 30 y 31 días
 * sin años bisiestos
 * 
 * 1 Enero = 31  
 * 2 Febrero = 28
 * 3 Marzo = 31 
 * 4 Abril = 30 
 * 5 Mayo = 31 
 * 6 Junio = 30 
 * 7 Julio = 31 
 * 8 Agosto = 31 
 * 9 Septiembre = 30
 * 10 Octubre = 31 
 * 11 Noviembre =30
 * 12 Diciembre = 31
 */
import javax.swing.JOptionPane;

public class Ejercicio_10 {
    public static void main(String[] args) {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));

        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                && (dia >= 1 && dia <= 31) && (anio > 0)) {
            JOptionPane.showMessageDialog(null, "Fecha correcta  " + mes + " - " + dia + " - " + anio);
        } else if ((mes == 4 || mes == 6 || mes == 11)
                && (dia >= 1 && dia <= 30) && (anio > 0)) {
            JOptionPane.showMessageDialog(null, "Fecha correcta  " + +mes + " - " + dia + " - " + anio);

        } else if ((mes == 2)
                && (dia >= 1 && dia <= 28) && (anio > 0)) {
            JOptionPane.showMessageDialog(null, "Fecha correcta  " + +mes + " - " + dia + " - " + anio);

        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta  " + +mes + " - " + dia + " - " + anio);
        }
    }
}
