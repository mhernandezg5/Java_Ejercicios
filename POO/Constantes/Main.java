package POO.Constantes;

public class Main {
    public static void main(String[] args) {
        // Dentro del método constructor del objeto le envío el argumento nombre
        // el método constructor en la clase toma el argumento como parámetro
        Nombre nombre = new Nombre("Mynor");
        // Con el metodo getter hago la instancia para el nombre que se asigna en la
        // clse
        System.out.println("Mi nombre es: " + nombre.getNombre());

        // Le envío el argumento con mi edad y el método set lo recibe como parámetro
        // Las variables están encapsuladas por lo que se manipulan con los metodos
        nombre.setEdad(32);
        // Con el metodo getter hago la instancia para la edad que se asigna en la clase
        System.out.println("Tengo " + nombre.getEdad() + " años");
    }

}
