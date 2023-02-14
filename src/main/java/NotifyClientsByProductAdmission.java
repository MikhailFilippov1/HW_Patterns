public class NotifyClientsByProductAdmission {
    public static void main(String[] args) {
        ProductAdmission productAdmission = new ProductAdmission();

        ProductObserver productObserver = new Client("Ваня");   //Есть список клиентов
        ProductObserver productObserver1 = new Client("Вова");
        ProductObserver productObserver2 = new Client("Аня");

        productAdmission.addProduct("Икра черная");                     //Новое поступление продуктов, ночью занесли в список продуктов
        productAdmission.addProduct("Икра заморская(баклажанная)");     // Клиенты еще не зарегистрировались


        productAdmission.addProductObserver(productObserver);       // Клиенты зашли в магазин и получили уведомление
        productAdmission.addProductObserver(productObserver1);

        productAdmission.addProduct("Водка Белуга");                //Тут неожиданно добавили новый продукт и опять получили уведомление

        productAdmission.addProductObserver(productObserver2);      //Неожтданно зашла Аня и получила уведомление


    }
}
