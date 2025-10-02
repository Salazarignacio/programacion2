package collections;

public enum Categoria {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private String descripcion;

    private Categoria(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return descripcion;
    }

}
