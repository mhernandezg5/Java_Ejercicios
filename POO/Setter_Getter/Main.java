package POO.Setter_Getter;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(32);
        System.out.println("Mi edad es: " + persona.getEdad());

        persona.setNombre("Mynor");
        System.out.println("Mi nombre es: " + persona.getNombre());
    }
}
