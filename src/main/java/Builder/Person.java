package Builder;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

        public Person(Builder builder){
        firstName = builder.firstName;
        lastName = builder.lastName;
        middleName = builder.middleName;
        country = builder.country;
        address = builder.address;
        phone = builder.phone;
        age = builder.age;
        gender = builder.gender;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        private Builder() {
        }

        public Builder withFirstName(String val) {
            firstName = val;
            return this;
        }

        public Builder withLastName(String val) {
            lastName = val;
            return this;
        }

        public Builder withMiddleName(String val) {
            middleName = val;
            return this;
        }

        public Builder withCountry(String val) {
            country = val;
            return this;
        }

        public Builder withAddress(String val){
            address = val;
            return this;
        }

        public Builder withPhone(String val){
            phone = val;
            return this;
        }

        public Builder withAge(Integer val){
            age = val;
            return this;
        }

        public Builder withGender(String val){
            gender = val;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                " Фамилия='" + lastName + '\'' +
                ",Имя='" + firstName + '\'' +
                ", Отчество='" + middleName + '\'' +
                ", Страна проживания='" + country + '\'' +
                ", Почтовый адрес='" + address + '\'' +
                ", телефон='" + phone + '\'' +
                ", возраст=" + age +
                ", пол='" + gender + '\'' +
                '}';
    }
}
