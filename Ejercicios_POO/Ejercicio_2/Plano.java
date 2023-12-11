package Ejercicios_POO.Ejercicio_2;

public class Plano {
    // Atributos
    private int x;
    private int y;

    // Método constructor de la clase para manipula variables
    public Plano(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover_Arriba(int incremento) {
        y += incremento;
    }

    public void mover_Abajo(int incremento) {
        y -= incremento;
    }

    public void mover_Derecha(int incremento) {
        x += incremento;
    }

    public void mover_Izquierda(int incremento) {
        x -= incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
