package generics;

public class Deportista extends Persona {

    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return super.toString() + "Deportista{" + "deporte=" + deporte + '}';
    }

}
