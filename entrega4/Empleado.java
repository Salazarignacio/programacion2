package entrega4;

public class Empleado {

    static int totalEmpleados = 0;
    private int id;
    private String nombre;
    private String puesto;
    private int salario;

    Empleado(int id, String nombre, String puesto, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    Empleado(String nombre, String puesto) {
        this.id = 00;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000;
        totalEmpleados++;
    }

    void actualizarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
        System.out.println(salario);
    }

    void actualizarSalario(int montoFijo) {
        salario += montoFijo;
        System.out.println(salario);
    }

    @Override
    public String toString() {
        return "ID: " + id + " Nombre: " + nombre + " Puesto: " + puesto + " Salario: $" + salario;
    }

    int getCantidadEmpleados() {
        return totalEmpleados;
    }

}
