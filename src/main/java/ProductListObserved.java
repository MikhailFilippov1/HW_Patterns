public interface ProductListObserved {
    public void addProductObserver(ProductObserver productObserver);

    public void removeProductObserver(ProductObserver productObserver);

    public void notifyProductObservers(ProductObserver productObserver);
}
