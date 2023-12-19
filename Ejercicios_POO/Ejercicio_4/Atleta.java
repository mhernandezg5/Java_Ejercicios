package Ejercicios_POO.Ejercicio_4;

public class Atleta {
    private int no_atleta;
    private String nombre;
    private float tiempo_Carrera;

    // Metodo constructor para manipular variables encapsuladas
    public Atleta(int no_atleta, String nombre, float tiempo_Carrera) {
        this.no_atleta = no_atleta;
        this.nombre = nombre;
        this.tiempo_Carrera = tiempo_Carrera;
    }

    // Mettodo get para obtener tiempo de carrera
    public float getTiempo_Carrera() {
        return tiempo_Carrera;
    }

    // Metodo para mostrar los datos de ganador
    public String mostrarGanador() {
        return "Atleta: " + no_atleta + "\nombre: " + nombre + "\nTiempo: " + tiempo_Carrera;
    }

}
