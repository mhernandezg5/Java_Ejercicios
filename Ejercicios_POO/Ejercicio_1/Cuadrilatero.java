package Ejercicios_POO.Ejercicio_1;

public class Cuadrilatero {
    // Atrivutos
    private float lado_1;
    private float lado_2;

    // Método constructor 1

    // Si los lados son diferentes
    public Cuadrilatero(float lado_1, float lado_2) {
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
    }

    // SI el lado 1 y 2 son iguales solo se envía uno pero se igualan
    public Cuadrilatero(float lado_1) {
        this.lado_1 = this.lado_2 = lado_1;
    }

    // Muestra y calcula el perimetro
    public float getPerimetro() {
        float perimetro = 2 * (lado_1 + lado_2);
        return perimetro;
    }

    // Muestra y calcula el área
    public float getArea() {
        float area = (lado_1 * lado_2);
        return area;
    }

}
