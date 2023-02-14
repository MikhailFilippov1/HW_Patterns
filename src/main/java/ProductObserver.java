import java.util.List;

public interface ProductObserver {
    public void handleEvent(List<String> products);
}
