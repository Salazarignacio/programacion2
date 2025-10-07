package s7_4;

public class Vaca extends Animal {
//● Subclases: Perro, Gato, Vaca sobrescriben hacerSonido() con @Override

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("Muuuu!");
    }

}
