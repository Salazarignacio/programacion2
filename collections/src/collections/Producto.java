package collections;

public class Producto {

    /*● id (String) → Identificador único del producto.
● nombre (String) → Nombre del producto.
● precio (double) → Precio del producto.
● cantidad (int) → Cantidad en stock.
● categoria (CategoriaProducto) → Categoría del producto. */
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private Categoria categoria;

    public void mostrarInfo() {
        System.out.println(this);
    }

    public Producto(String id, String nombre, double precio, int cantidad, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }

}
