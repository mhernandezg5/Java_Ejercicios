package Ejercicios_POO.Ejercicio_3;

public class Vehiculo {
    // atributos
    private String marca;
    private String modelo;
    private float precio;

    // método constructor para inicializar variables
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // obtiene el precio
    public float getPrecio() {
        return precio;
    }

    // Imprime los datos
    public String mostrarDatos() {
        return "Marca: " + marca + " \nModelo: " + modelo + "\n Precio: Q. " + precio + "\n";
    }

}
