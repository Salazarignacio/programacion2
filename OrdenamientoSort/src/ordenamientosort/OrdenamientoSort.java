package ordenamientosort;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenamientoSort {

    public static void main(String[] args) {
        ArrayList colores = new ArrayList<String>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        ArrayList num = new ArrayList();
        num.add(22);
        num.add(11);
        num.add(33);

        Collections.sort(colores);
        Collections.sort(num);
        System.out.println(colores);
        System.out.println(num);
        

    }

}
