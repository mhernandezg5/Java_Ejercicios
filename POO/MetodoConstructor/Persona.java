package POO.MetodoConstructor;

public class Persona {
    // Atributos
    String nombre;
    int edad;

    // Método constructor
    // se diferncia porque tiene el mismo nombre de la clase
    public Persona(String nombre, int edad) {
        // El this. indica que son los atributos de la clase
        // Los que no tienen this indican que son los parámetros del método
        this.nombre = nombre;
        this.edad = edad;
    }

    // Mostrar
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
