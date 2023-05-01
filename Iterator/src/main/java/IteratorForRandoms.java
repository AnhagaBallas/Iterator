import java.util.Iterator;
import java.util.Random;

public class IteratorForRandoms implements Iterator<Integer> {
    private Randoms randoms;
    private Random random = new Random();

    public IteratorForRandoms(Randoms randoms) {
        this.randoms = randoms;


    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int diff = randoms.getMax() - randoms.getMin();
        int next = random.nextInt(diff + 1);
        next += randoms.getMin();
        return next;

    }
}
