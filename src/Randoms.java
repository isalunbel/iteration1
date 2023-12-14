import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
     Random random;
     int min;
     int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    public Iterator<Integer> iterator() {
        return new RandomsIterator(this);
    }
}