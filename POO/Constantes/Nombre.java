package POO.Constantes;

public class Nombre {

    private final String nombre; // Varibale constante y encapsulada del nombre
    private int edad; // La edad está encapsulada pero no es constante, cambia durante la ejecución

    // Metodo constructor para la asignar el nombre a la variable encapsulada y
    // constante
    // El nombre lo recibe desde el constructor
    public Nombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo getter para mostrar el nombre asignado
    public String getNombre() {
        return nombre;
    }

    // SET Y GET
    // Asigna la edad desde el objeto de la clase main
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Muestra la edad que se llama desde el objeto de la clase princpial
    public int getEdad() {
        return edad;
    }
}
