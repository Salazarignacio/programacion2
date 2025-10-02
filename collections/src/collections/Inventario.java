package collections;

import java.util.ArrayList;

public class Inventario {

    /*● ArrayList<Producto> productos Métodos requeridos:
● agregarProducto(Producto p)-
● listarProductos()-
● buscarProductoPorId(String id)-
● eliminarProducto(String id)-
● actualizarStock(String id, int nuevaCantidad)-
● filtrarPorCategoria(CategoriaProducto categoria) -
● obtenerTotalStock() - 
● obtenerProductoConMayorStock() - 
● filtrarProductosPorPrecio(double min, double max) -
● mostrarCategoriasDisponibles() -*/
    ArrayList<Producto> productos = new ArrayList();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (Producto prod : productos) {
            System.out.println(prod);
        }
    }

    public Producto buscarProductoPorId(String id) {
        Producto encontrado = null;
        for (Producto prod : productos) {
            if (prod.getId().equals(id)) {
                encontrado = prod;
            }
        }
        return encontrado;
    }

    public Producto eliminarProducto(String id) {
        Producto eliminar = buscarProductoPorId(id);
        if (eliminar != null) {

            productos.remove(eliminar);

        }
        return eliminar;
    }

    public Producto actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
        }
        return producto;
    }

    public ArrayList<Producto> filtrarPorCategoria(Categoria categoria) {
        ArrayList<Producto> categorias = new ArrayList();
        for (Producto prod : productos) {
            if (prod.getCategoria().equals(categoria)) {
                categorias.add(prod);
            }
        }
        return categorias;
    }

    public int obtenerTotalStock() {
        int stock = 0;
        for (Producto prod : productos) {
            stock += prod.getCantidad();
        }
        return stock;
    }

    public Producto obtenerProductoConMayorStock() {
        int stock = 0;
        Producto mayorCant = null;
        for (Producto prod : productos) {
            if (stock < prod.getCantidad()) {
                stock = prod.getCantidad();
                mayorCant = prod;
            }
        }
        return mayorCant;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList();
        for (Producto prod : productos) {
            if (prod.getPrecio() < max && prod.getPrecio() > min) {
                filtrados.add(prod);
            }
        }
        return filtrados;
    }

    public ArrayList<Categoria> mostrarCategoriasDisponibles() {
        ArrayList<Categoria> categorias = new ArrayList();
        for (Producto prod : productos) {
            if (!categorias.contains(prod.getCategoria())) {
                categorias.add(prod.getCategoria());
            }
        }
        return categorias;
    }
}
