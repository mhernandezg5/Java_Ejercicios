package POO.Sobrecarga;

public class Sobrecarga {
    // Atributos
    String nombre;
    int edad;
    String dpi;

    // Metodos
    // metodo constructor 1
    public Sobrecarga(String nombre, int edad) { // con dos parametros
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodo constructor 2
    public Sobrecarga(String dpi) { // Con un parametro
        this.dpi = dpi;
    }

    // MOSTRAR
    public void mostrar() { // sin parametros
        System.out.println("Soy " + nombre + " tengo " + edad + " años");
    }

    public void mostrar(String dpi) { // con un parametro
        System.out.println("Mi no de DPI es " + dpi + " soy programador");
    }

}
