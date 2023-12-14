import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {
    Randoms randoms;
    private int count;
    private final Random random = new Random();


    public RandomsIterator(Randoms randoms) {
        this.randoms = randoms;
        this.count = 0;
    }

    public boolean hasNext() {
        return count < randoms.max;
    }

    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        int randomValue = randoms.min + random.nextInt(randoms.max - randoms.min + 1);
        count++;

        return randomValue;
    }
}




