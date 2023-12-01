package Búsquedas;

import javax.swing.JOptionPane;

public class secuencial {
    public static void main(String[] args) {
        int[] arreglo = { 5, 2, 3, 1, 4 };
        int dato;
        boolean flag = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("¿Qué número desea buscar?"));

        // Busqueda secuencial
        int i = 0;

        while (i < arreglo.length && flag == false) {
            if (arreglo[i] == dato) {
                flag = true;
            }
            i++;
        }
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "El número no está en el arreglo");
        } else {
            JOptionPane.showMessageDialog(null, "El dato se encuentra en el arreglo: " + (i - 1));
        }

    }
}
