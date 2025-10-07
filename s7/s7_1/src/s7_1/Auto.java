package s7_1;

public class Auto extends Vehiculo {
//● Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe
//mostrarInfo()    

    int cantidadPuertas;

    Auto(String marca, String modelo, int cantPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantPuertas;
    }
    
    public String mostrarInfo() {
        return super.mostrarInfo() + " Cantidad de puertas: " + cantidadPuertas;
    }
}
