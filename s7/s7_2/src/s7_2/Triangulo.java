package s7_2;

public class Triangulo extends Figura {
//● Subclases: Círculo y Rectángulo implementan el cálculo del área

    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del triangulo es: " + base * altura / 2);
    }
}
