package s7_3;

import java.util.ArrayList;

public class S7_3 {
//3. Empleados y polimorfismo
//● Clase abstracta: Empleado con método calcularSueldo()
//● Subclases: EmpleadoPlanta, EmpleadoTemporal
//● Tarea: Crear lista de empleados, invocar calcularSueldo() polimórficamente,
//usar instanceof para clasificar

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList();
        empleados.add(new EmpleadoPlanta("Ignacio"));
        empleados.add(new EmpleadoTemporal("Nicolas"));
        empleados.add(new EmpleadoPlanta("Florencia"));
        empleados.add(new EmpleadoTemporal("Gabriela"));

        
        // Para que tenga sentido el polimorfismo hice que los temporales trabajen menos horas (sino seria para ambos el mismo método)
        // y para que tenga sentida el "instanceof" envié por parámetro dos ganancias distintas
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("El sueldo de un empleado planta es de $" + empleado.calcularSueldo(20));
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("el sueldo de un empleado temportal es de $" + empleado.calcularSueldo(15));
            }
        }
    }

}
