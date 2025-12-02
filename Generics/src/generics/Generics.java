package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

        Sorteador<String> sorteo = new Sorteador();
        sorteo.add("Nacho");
        sorteo.add("F");
        sorteo.add("tru");
        //System.out.println(sorteo.get());
        //System.out.println(sorteo.remove());
        Club rosario = new Club("Rosario Central", PaisSudamericano.ARGENTINA);
        Club rosario2 = new Club("Scapin Hnos", PaisSudamericano.ARGENTINA);
        ArrayList<Club> clubes = new ArrayList();
        clubes.add(rosario);
        clubes.add(rosario2);
        Persona p1 = new Persona("Ignacio", 39);
        Persona p2 = new Persona("Florencia", 35);
        ArrayList<Object> PyC = new ArrayList();
        PyC.add(p1);
        PyC.add(p2);
        PyC.add(rosario);
        PyC.add(rosario2);
        Deportista d1 = new Deportista("Salacrack", 39, "Futbol");
        PyC.add(d1);
        //verElementos(PyC);
        UtilList.verComodin(PyC);
    }

    public static <T> void verElementos(ArrayList<T> elementos) {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

}
