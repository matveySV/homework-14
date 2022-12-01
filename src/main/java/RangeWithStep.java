import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeWithStep implements Iterable<Integer> {
    private final int start;
    private final int end;
    private final int step;

    public RangeWithStep(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int cursor = start;

            @Override
            public boolean hasNext() {
                return cursor <= end;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer result = cursor;
                cursor = cursor + step;
                return result;
            }
        };
    }
}
