package interfaces_excepciones;

import java.util.ArrayList;

public class Pedido implements Pagable, Notificable {

    private Cliente cliente;
    EstadosPedido estado = EstadosPedido.SIN_PRESUPUESTO;

    private ArrayList<Producto> pedido = new ArrayList();

    public void agregarProducto(Producto prod) {
        pedido.add(prod);
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (this.cliente != null && this.cliente.getPedido() != this) {
            cliente.setPedido(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public double calcularTotal() {
        estado = EstadosPedido.PRESUPUESTANDO;
        double total = 0;
        for (Producto prod : pedido) {
            total += prod.calcularTotal();
        }
        estado = EstadosPedido.PRESUPUESTADO;
        System.out.println("Monto en bruto  $" + total);
        return total;
    }

    @Override
    public void notificar() {
        Notificable.super.notificar();
        System.out.println("El estado del pedido es " + estado);

    }
}
