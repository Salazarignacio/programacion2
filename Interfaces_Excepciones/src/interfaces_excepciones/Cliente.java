package interfaces_excepciones;

// 5. Crear una interfaz Notificable para notificar cambios de estado. La clase Cliente implementa 
// dicha interfaz y Pedido debe notificarlo al cambiar de estado.
public class Cliente implements Notificable {

    private EstadosCliente estado;
    private String nombre;
    private TarjetaCredito tarjeta;
    private PayPal pp;
    private Pedido pedido;

    public Cliente(String nombre) {
        this.nombre = nombre;
        estado = EstadosCliente.NO_ADEUDA;
    }

    protected void setEstado(EstadosCliente estado) {
        this.estado = estado;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (this.tarjeta != null && this.tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }

    public void setPayPal(PayPal pp) {
        this.pp = pp;
        if (this.pp != null && this.pp.getCliente() != this) {
            pp.setCliente(this);
        }
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
        if (this.pedido != null && this.pedido.getCliente() != this) {
            pedido.setCliente(this);
        }
    }

    public Pedido getPedido() {
        return pedido;
    }
    
    

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public PayPal getPayPal() {
        return pp;
    }

    @Override
    public void notificar() {
        Notificable.super.notificar();
        System.out.println("El estado del cliente es " + estado);
    }

}
