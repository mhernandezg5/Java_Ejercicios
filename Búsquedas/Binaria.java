package Búsquedas;

import javax.swing.JOptionPane;

public class Binaria {
    public static void main(String[] args) {
        // Debe estar odenado en forma creciente
        int arreglo[] = { 1, 2, 3, 4, 5 };

        int dato = Integer.parseInt(JOptionPane.showInputDialog("Que número busca: "));

        // Busqueda binaria
        int inferior, superior, mitad, iterador;
        boolean flag = false;
        inferior = 0;
        superior = arreglo.length;
        iterador = 0;
        mitad = ((inferior + superior) / 2);

        while (inferior <= superior && iterador < arreglo.length) {
            if (arreglo[mitad] == dato) {
                flag = true;
                break; // en caso se encuentre se sale del ciclo
            }
            if (arreglo[mitad] > dato) {
                superior = mitad;
                mitad = ((inferior + superior) / 2);
            }
            if (arreglo[mitad] < dato) {
                inferior = mitad;
                mitad = ((inferior + superior) / 2);
            }
            iterador++;
        }
        if (flag == true) {
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado: " + mitad);
        } else {
            JOptionPane.showMessageDialog(null, "EL número no está en el arreglo");
        }
    }
}
