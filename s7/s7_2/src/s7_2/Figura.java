package s7_2;

public abstract class Figura {

    ////● Clase abstracta: Figura con método calcularArea() y atributo nombre
    private String nombre;
    
    public Figura(String nombre){
        this.nombre = nombre;
    }
    public void calcularArea(){
        System.out.println("Se calcula el area de las figuras");
    }
}
