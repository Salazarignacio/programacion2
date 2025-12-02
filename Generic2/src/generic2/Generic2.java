package generic2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Generic2 {

    public static void main(String[] args) {
        ArrayList colores = new ArrayList<String>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        Auto a1 = new Auto("AE912");
        Persona p1 = new Persona("Ignacio", 39, 1.91, 12333);
        Persona p2 = new Persona("Flor", 35, 1.60, 22335);
        Persona p3 = new Persona("Ayra", 3, 10.35, 35);
        identificar(a1);

        ArrayList<Persona> personas = new ArrayList();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        Collections.sort(colores, new comparadorColores());
        System.out.println(colores);
        Collections.sort(personas);

        System.out.println(personas);

        System.out.println(buscador(personas, 12333));
    }

    public static void identificar(Identificable obj) {
        System.out.println(obj.getID());
    }

    public static T buscador

    <T, K>  (<   ?  
         
        extends Identificable> elementos, K id){
        T encontrado = null;
        Iteator<? extends T> it = elementos.iterator();
        while (it.hasNext() && encontrado == null) {
            <   ? extends T > a = it.hasNext();
            if (a.esIgual(id)) {
                encontrado = a;
            }
        }
        return encontrado;
    }
}
