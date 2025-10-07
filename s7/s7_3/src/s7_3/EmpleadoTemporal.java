package s7_3;

public class EmpleadoTemporal extends Empleado {

    public EmpleadoTemporal(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularSueldo(double precioHora) {
        return precioHora * 80;
    }

}
