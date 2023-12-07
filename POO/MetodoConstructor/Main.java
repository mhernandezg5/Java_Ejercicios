package POO.MetodoConstructor;

public class Main {
    public static void main(String[] args) {
        // dentro del método constructor se envían los argumentos
        // el método toma los argumenots como parámetros
        // el método iguala los parámetros con los atributos de la clase
        Persona per = new Persona("Mynor", 32);

        // muestra los valores del método que son los atributos de la clase
        // Al igualar los parámetros del método toma los valores de atributos y los
        // muestra
        per.imprimir();

    }

}
