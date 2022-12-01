import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {
    private final int start;
    private final int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
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
                return cursor++;
            }
        };
    }


}
/*
Створити Range який має поля start та end
Реалізувати RangeIterator


Створити RangeWithStep який має поля start, end та step
Реалізувати RangeIteratorWithStep

for (Integer integer : new Range(1, 100)) {
     System.out.println(integer);
   }

for (Integer integer : new RangeWithStep(1, 10, 2)) {
     System.out.println(integer);
  }

 */