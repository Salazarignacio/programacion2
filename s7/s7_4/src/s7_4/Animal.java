package s7_4;

public class Animal {
//● Clase: Animal con método hacerSonido() y describirAnimal()

    private final String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Soy un animal y hago...");
    }

    public void describirAnimal() {
        System.out.println("El nombre del animal es " + this.nombre);
    }
}
