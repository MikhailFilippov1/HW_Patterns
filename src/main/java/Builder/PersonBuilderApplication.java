package Builder;

public class PersonBuilderApplication {
    public static void main(String[] args) {
        Person person = Person.newBuilder()
                .withLastName("Иванов")
                .withFirstName("Иван")
                .withMiddleName("Иванович")
                .withCountry("Niger")
                .withAddress("Bamako")
                .withPhone("+795643266421")
                .withAge(35)
                .withGender("Male")
                .build();

        Person person1 = Person.newBuilder()
                .withLastName("Иванова")
                .withFirstName("Марья")
                .withAddress("Bamako")
                .withGender("Female")
                .build();

        System.out.println(person);
        System.out.println(person1);
    }
}
