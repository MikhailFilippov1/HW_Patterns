package HW2.MyArrayList;

import java.util.Iterator;

public class MyArrayListIterator<E> implements Iterator {
    private int index = 0;
    private E[] values;

    public MyArrayListIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public Object next() {
        return values[index++];
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
