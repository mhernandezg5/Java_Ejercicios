package POO.Estaticos;

public class Main {
    private static String nombre = "Mynor Augsto"; // Static lo hace usar solo para la clase local

    public int suma(int numero_1, int numero_2) {
        int suma = numero_1 + numero_2;
        return suma;
    }

    public static void main(String[] args) {

        Main objeto = new Main();

        System.out.println(Main.nombre); // SE puede llamar directamente de la clase

        // SE llama el método por medio del objeto como normalmente se hace
        System.out.println("La suma es: " + objeto.suma(2, 5));

    }
}
