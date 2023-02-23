package HW2.MyArrayList;

public class lesson2 {
    public static void main(String[] args) {
        MyArrayListInterface<String> strings = new MyArrayList<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Fife");

        strings.display();
        strings.update(3, "Four+");
        strings.display();
        strings.delete(0);
        strings.display();
        strings.set(0, "One+");
        strings.display();
        System.out.println(strings.get(3));
        System.out.println(strings.size());
        strings.erase();
        strings.display();
        System.out.println(strings.size());
        System.out.println(strings.isEmpty());

    }
}
