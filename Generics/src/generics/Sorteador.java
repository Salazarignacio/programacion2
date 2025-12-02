package generics;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;

public class Sorteador<T> {

    private ArrayList<T> elementos;
    private Random random;

    public Sorteador() {
        this.elementos = new ArrayList<>();
        this.random = new Random();
    }

    public void add(T elemento) {
        elementos.add(elemento);
    }

    public T get() {
        int rnd = random.nextInt(elementos.size());
        return elementos.get(rnd);
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int rnd = random.nextInt(elementos.size());
        return elementos.remove(rnd);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

}
