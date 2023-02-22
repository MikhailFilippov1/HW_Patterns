package HW2.MyLinkedList;

import java.util.Iterator;

public class lesson2 {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.insertFirst("Fedor zero");
        list.insertFirst("Artem first");
        list.insertFirst("Vova second");
        list.insertLast("Petya third");
        list.insertLast("Fedya fourth");
        System.out.println(list.size());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.display();
        System.out.println();
        System.out.println(list.getByIndex(0));
        System.out.println(list.getByIndex(1));
        System.out.println();
        System.out.println(list.getByElement("Fedya fourth"));
        list.remove("Fedya fourth");
        list.display();
        System.out.println();
        list.deleteFirst();
        list.deleteLast();
        System.out.println();
        list.display();
        System.out.println();

        for (String s : list){
            System.out.println(s);
        }

        Iterator iterator = list.descIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
