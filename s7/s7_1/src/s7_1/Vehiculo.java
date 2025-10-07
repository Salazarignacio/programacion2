package s7_1;

public abstract class Vehiculo {
//● Clase base: Vehículo con atributos marca, modelo y método mostrarInfo()

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String mostrarInfo() {
        return "Vehiculo marca: " + marca + " modelo: " + modelo;
    }
}
