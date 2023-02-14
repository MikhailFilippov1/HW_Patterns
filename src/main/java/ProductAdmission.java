import java.util.ArrayList;
import java.util.List;

public class ProductAdmission implements ProductListObserved{

    List<String> products = new ArrayList<>();
    List<ProductObserver> clients = new ArrayList<>();

    public void addProduct(String product){
        this.products.add(product);
        for (int i = 0; i < clients.size(); i++) {
            notifyProductObservers(clients.get(i));
        }
    }

    @Override
    public void addProductObserver(ProductObserver productObserver) {
        this.clients.add(productObserver);
        notifyProductObservers(productObserver);
    }

    @Override
    public void removeProductObserver(ProductObserver productObserver) {
        this.clients.remove(productObserver);
    }

    @Override
    public void notifyProductObservers(ProductObserver productObserver) {
            productObserver.handleEvent(this.products);
    }
}
