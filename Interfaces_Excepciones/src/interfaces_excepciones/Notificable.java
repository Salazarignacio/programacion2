package interfaces_excepciones;

// 5. Crear una interfaz Notificable para notificar cambios de estado. La clase Cliente implementa 
// dicha interfaz y Pedido debe notificarlo al cambiar de estado.


public interface Notificable {

    default void notificar() {
        System.out.println("#### NOTIFICACION ####");
    }
;
}
