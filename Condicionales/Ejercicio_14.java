
/*
 * Hacer un programa que pase de Kg 
 * a otra unidad de medida de masa, 
 * mostrar en pantalla un menú con las opciones posibles.
 * Hectogramos 10
 * Decagramos 100
 * Gramos 1000
 * Decigramos 10000
 * Centigramos 100000
 * Miligramos 1000000
 */
import javax.swing.JOptionPane;

public class Ejercicio_14 {
    public static void main(String[] args) {
        float gramos = Float.parseFloat(JOptionPane.showInputDialog("Escribe los gramos "));
        int opciones = Integer.parseInt(JOptionPane.showInputDialog(
                "1. Hectogramos \n 2. Decagramos \n 3. Gramos \n 4. Decigramos \n 5. Centigramos \n 6. Miligramos"));
        switch (opciones) {
            case 1:
                gramos = gramos * 10;
                JOptionPane.showMessageDialog(null, "Hectogramos: " + gramos);
                break;
            case 2:
                gramos = gramos * 100;
                JOptionPane.showMessageDialog(null, "Decagramos: " + gramos);
                break;
            case 3:
                gramos = gramos * 1000;
                JOptionPane.showMessageDialog(null, "Gramos: " + gramos);
                break;
            case 4:
                gramos = gramos * 10000;
                JOptionPane.showMessageDialog(null, "Decigramos: " + gramos);
                break;
            case 5:
                gramos = gramos * 100000;
                JOptionPane.showMessageDialog(null, "Centigramos: " + gramos);
                break;
            case 6:
                gramos = gramos * 1000000;
                JOptionPane.showMessageDialog(null, "Miligramos: " + gramos);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Beeem no existe opción");
                break;
        }
    }
}
