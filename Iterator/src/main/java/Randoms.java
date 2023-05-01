import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected static int min;
    protected static int max;
    protected Random random = new Random();
    protected int result = 0;

    public Randoms() {

    }

    public Randoms(int min, int max) {
        int diff = max - min;
        int next = random.nextInt(diff + 1);
        next += min;
        this.result = next;
        this.min = min;
        this.max = max;

    }

    public int getResult() {
        return result;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    @Override
    public Iterator<Integer> iterator() {
        IteratorForRandoms iterator = new IteratorForRandoms(this);
        return iterator;
    }


}