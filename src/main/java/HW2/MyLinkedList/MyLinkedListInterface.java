package HW2.MyLinkedList;

public interface MyLinkedListInterface<E> {
    void display();
    E getFirst();
    E getLast();
    void insertFirst(E e);
    void insertLast(E e);
    void deleteFirst();
    void deleteLast();
    int size();
    boolean remove(E e);
    E getByIndex(int idx);
    E getByElement(E e);
    boolean isEmpty();
}
