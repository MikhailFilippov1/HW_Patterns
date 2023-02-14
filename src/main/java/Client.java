import java.util.List;

public class Client implements ProductObserver{
    String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> products) {
        System.out.println("Уважаемый " + name + "!" + "\nУ нас новое поступление продуктов! Предлагаем вашему вниманию:\n" + products + "\n");
    }
}
