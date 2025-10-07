package s7_2;

import java.util.ArrayList;

public class S7_2 {

    public static void main(String[] args) {
//2. Figuras geométricas y métodos abstractos
//● Clase abstracta: Figura con método calcularArea() y atributo nombre
//● Subclases: Círculo y Rectángulo implementan el cálculo del área
//● Tarea: Crear un array de figuras y mostrar el área de cada una usando
//polimorfismo.
       
    ArrayList<Figura> figuras = new ArrayList();
    figuras.add(new Circulo("Circulo_1", 8));
    figuras.add(new Circulo("Circulo_2", 3.2));
    figuras.add(new Triangulo("Triangulo_1", 2.5, 3.0));
    figuras.add(new Triangulo("Triangulo_2", 8.0, 12.5));
    
    for (Figura figura : figuras ){
        figura.calcularArea();
    }

    
}
    
}
