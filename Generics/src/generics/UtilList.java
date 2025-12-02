package generics;

import java.util.List;

public class UtilList {

    public static void verComodin(List<?> elementos) {
        for (Object elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void verConExtends(List<? extends Persona> elementos) {
        for (Persona elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
