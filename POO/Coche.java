package POO;

public class Coche {
    String color;
    String marca;
    int km;

    public static void main(String[] args) {
        // Constructor de l objeto
        // COche 1
        Coche coche_1 = new Coche();

        // Le pasa los atributos
        coche_1.color = "Nebro";
        coche_1.marca = "Twingo";
        coche_1.km = 0;

        // Imprimir
        System.out.println("Color: " + coche_1.color);
        System.out.println("Marca: " + coche_1.marca);
        System.out.println("Kilometraje: " + coche_1.km);

        // COCHE 2
        Coche coche_2 = new Coche();
        // Le pasa los atributos
        coche_2.color = "Verde";
        coche_2.marca = "Toyota";
        coche_2.km = 200;

        // Imprimir
        System.out.println("\nColor: " + coche_2.color);
        System.out.println("Marca: " + coche_2.marca);
        System.out.println("Kilometraje: " + coche_2.km);

    }

}
