package s7_1;

public class S7_1 {

    public static void main(String[] args) {
//● Clase base: Vehículo con atributos marca, modelo y método mostrarInfo()
//● Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe
//mostrarInfo()
//● Tarea: Instanciar un auto y mostrar su información completa.

        Auto auto1 = new Auto("Chevrolet", "Onix", 5);
        System.out.println(auto1.mostrarInfo());
    }

}
