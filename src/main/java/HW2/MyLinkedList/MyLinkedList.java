package HW2.MyLinkedList;

import java.util.Iterator;

public class MyLinkedList<E> implements MyLinkedListInterface<E>, Iterable<E>, DescendingIterator<E>{
    private LinkNode<E> first;
    private LinkNode<E> last;
    private int size = 0;

    public MyLinkedList(){
        first = null;
        last = null;
    }

    @Override
    public void display(){
        LinkNode<E> temp = first;
        for (int i = 0; i < size; i++) {
            temp.display();
            temp = getNextNode(temp);
        }
    }

    @Override
    public E getFirst() {
        return getByIndex(0);
    }

    @Override
    public E getLast() {
        return getByIndex(size - 1);
    }

    @Override
    public void insertFirst(E e) {
        LinkNode<E> newNode = new LinkNode<>(e, null, first);
        if(isEmpty()){
            last = newNode;
        } else {
            first.previousNode = newNode;
        }
        first = newNode;
        size++;
    }

    @Override
    public void insertLast(E e) {
        LinkNode<E> newNode = new LinkNode<>(e, last, null);
        if(isEmpty()){
            first = newNode;
        } else {
            last.nextNode = newNode;
        }
        last = newNode;
        size++;
    }

    @Override
    public E getByIndex(int idx) {
        LinkNode<E> temp = first;
        for (int i = 0; i < idx; i++) {
            temp = getNextNode(temp);
        }
        return temp.getNodeElement();
    }

    @Override
    public E getByElement(E e) {
        LinkNode<E> current = first;
        while (current.element != e){
            if(current.nextNode == null)
                return null;
            else
                current = current.nextNode;
        }
        return  current.element;
    }

    private LinkNode<E> getNextNode(LinkNode<E> currentNode){
        return currentNode.getNextNode();
    }

    @Override
    public void deleteFirst() {
        LinkNode<E> temp = first;
        if (first.nextNode == null)
            first = last;
        first = temp.getNextNode();
        size--;
    }

    @Override
    public void deleteLast() {
        LinkNode<E> temp = last;
        if (last.previousNode == null)
            first = last;
        last = temp.getPreviousNode();
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(E e) {
        LinkNode<E> current = first;
        LinkNode<E> previous = first;
        while (current.element != e){
            if(current.nextNode == null)
                return false;
            else {
                previous = current;
                current = current.nextNode;
            }
        }
        if(current == first)
            first = first.nextNode;
        else
            previous.nextNode = current.nextNode;
        size--;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<E> descIterator() {
        return new Iterator<E>() {
            int counter = size - 1;

            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public E next() {
                return getByIndex(counter--);
            }
        };
    }

    private class LinkNode<E> {
        private E element;
        private LinkNode<E> nextNode;
        private LinkNode<E> previousNode;

        private LinkNode(E element, LinkNode<E> previousNode, LinkNode<E> nextNode){
            this.element = element;
            this.nextNode = nextNode;
            this.previousNode = previousNode;
        }

        public void display(){
            System.out.print("<-prev[ " + this.element + "]next->");
        }

        public E getNodeElement(){
            return element;
        }

        public void setNodeElement(E e) {
            this.element = e;
        }

        public LinkNode<E> getNextNode(){
            return nextNode;
        }

        public void setNextNode(LinkNode<E> node){
            this.nextNode = node;
        }

        public LinkNode<E> getPreviousNode(){
            return previousNode;
        }

        public void setPreviousNode(LinkNode<E> node){
            this.previousNode = node;
        }
    }
}
