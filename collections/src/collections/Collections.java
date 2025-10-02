package collections;

import java.util.ArrayList;

public class Collections {

    /*1. Crear al menos cinco productos con diferentes categorías y agregarlos al
inventario. -
2. Listar todos los productos mostrando su información y categoría. -
3. Buscar un producto por ID y mostrar su información.
4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
5. Eliminar un producto por su ID y listar los productos restantes.
6. Actualizar el stock de un producto existente.
7. Mostrar el total de stock disponible.
8. Obtener y mostrar el producto con mayor stock.
9. Filtrar productos con precios entre $1000 y $3000.
10. Mostrar las categorías disponibles con sus descripciones.  */
    public static void main(String[] args) {
        Inventario inv1 = new Inventario();

        inv1.agregarProducto(new Producto("KKJN", "Turron", 250.00, 35, Categoria.ALIMENTOS));
        inv1.agregarProducto(new Producto("KBBL", "Mouse", 55250.00, 35, Categoria.ELECTRONICA));
        inv1.agregarProducto(new Producto("OICAN", "Almohadon", 2250.00, 35, Categoria.HOGAR));
        inv1.agregarProducto(new Producto("XXMN", "Sabana", 2250.00, 35, Categoria.HOGAR));
        inv1.agregarProducto(new Producto("YYWXG", "Gaseosa", 3000.00, 15, Categoria.ALIMENTOS));

        inv1.listarProductos();
        System.out.println("2) -----------------------");
        inv1.eliminarProducto("OICAN");
        inv1.listarProductos();
        System.out.println("3) -----------------------");
        inv1.actualizarStock("KKJN", 49);
        inv1.listarProductos();
        System.out.println("4) -----------------------");
        for (Producto prod : inv1.filtrarPorCategoria(Categoria.ALIMENTOS)) {
            System.out.println(prod);
        };
        System.out.println("5) -----------------------");
        inv1.eliminarProducto("OICAN");
        inv1.listarProductos();
        System.out.println("6) -----------------------");
        inv1.actualizarStock("XXMN", 15358);
        System.out.println(inv1.buscarProductoPorId("XXMN"));
        System.out.println("7) -----------------------");
        System.out.println("Total productos en stock: " + inv1.obtenerTotalStock());
        System.out.println("8) -----------------------");
        System.out.println("Total productos en stock: " + inv1.obtenerProductoConMayorStock());
        System.out.println("9) -----------------------");
        for (Producto prod : inv1.filtrarProductosPorPrecio(2999.0, 100000.0)) {
            System.out.println(prod);
        }
        System.out.println("10) -----------------------");
        System.out.println("Categorias disponibles: " + inv1.mostrarCategoriasDisponibles());

    }

}
