package s7_2;

public class Circulo extends Figura {
//● Subclases: Círculo y Rectángulo implementan el cálculo del área

    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del círuclo es: " + Math.PI * radio * radio);
    }
}
