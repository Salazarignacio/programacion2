package s7_4;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("Guau Guau!");
    }
}
