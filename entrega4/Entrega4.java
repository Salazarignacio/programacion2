package entrega4;

public class Entrega4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Ignacio", "Jefe", 3500);
        Empleado empleado2 = new Empleado(1, "Maria", "Gerente", 4500);
        Empleado empleado3 = new Empleado(1, "Facundo", "empleado", 1200);
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println("Cantidad empleados: " + empleado1.getCantidadEmpleados());
        empleado1.actualizarSalario(10.0);
        System.out.println(empleado1);
        empleado1.actualizarSalario(10);
        System.out.println(empleado1);
    }

}
