package HW2.MyArrayList;

public interface MyArrayListInterface<E> extends Iterable<E> {
    boolean add(E e);
    void delete(int idx);
    E get(int idx);
    int size();
    void set(int idx, E e);
    void display();
    void erase();
    boolean isEmpty();
    void update(int idx, E e);
}
