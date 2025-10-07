package s7_3;

public class EmpleadoPlanta extends Empleado {

    public EmpleadoPlanta(String nombre) {
        super(nombre);
    }
    
    @Override
    public double calcularSueldo(double precioHora) {
        return precioHora * 160;
    }

}
