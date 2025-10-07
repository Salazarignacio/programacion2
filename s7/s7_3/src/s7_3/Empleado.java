package s7_3;

public abstract class Empleado {
//● Clase abstracta: Empleado con método calcularSueldo()

    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public double calcularSueldo(double sueldo) {
        return sueldo;
    }

}
