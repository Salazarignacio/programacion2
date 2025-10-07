package s7_4;

import java.util.ArrayList;

public class S7_4 {

    public static void main(String[] args) {
//        4. Animales y comportamiento sobrescrito
//● Clase: Animal con método hacerSonido() y describirAnimal()
//● Subclases: Perro, Gato, Vaca sobrescriben hacerSonido() con @Override
//● Tarea: Crear lista de animales y mostrar sus sonidos con polimorfismo

        ArrayList<Animal> animales = new ArrayList();
        animales.add(new Vaca("Lola"));
        animales.add(new Gato("Ayra"));
        animales.add(new Perro("Luana"));
        
        for (Animal animal : animales){
            animal.hacerSonido();
        }
    }
}
