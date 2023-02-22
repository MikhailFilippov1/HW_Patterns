package HW2.MyArrayList;

import java.util.Iterator;

public class MyArrayList<E> implements MyArrayListInterface<E>{
    private E[] values;

    public MyArrayList() {
        values = (E[]) new Object[0];
    }

    public void display() {
        for (E e : values) {
            System.out.println(e);
        }
    }

    @Override
    public boolean add(E e) {
        try {
            E[] oldValues = values;
            values = (E[]) new Object[oldValues.length + 1];
            System.arraycopy(oldValues, 0, values, 0, oldValues.length);
            values[values.length - 1] = e;
            return true;
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int idx) {
        try {
            E[] oldValues = values;
            values = (E[]) new Object[oldValues.length - 1];
            System.arraycopy(oldValues, 0, values, 0, idx);
            System.arraycopy(oldValues, idx + 1, values, idx, oldValues.length - idx - 1);
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int idx) {
            return values[idx];
        }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void set(int idx, E e) {
        try {
            E[] oldValues = values;
            values = (E[]) new Object[oldValues.length + 1];
            System.arraycopy(oldValues, 0, values, 0, idx);
            values[idx] = e;
            System.arraycopy(oldValues, idx, values, idx + 1, oldValues.length - idx);
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator<>(values);
    }

    @Override
    public void erase(){
        this.values = (E[]) new Object[0];
    }

    @Override
    public boolean isEmpty(){
        return !(values.length > 0);
    }

    @Override
    public void update(int idx, E e) {
        values[idx] = e;
    }
}

