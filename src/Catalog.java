import java.util.LinkedList;

public class Catalog<T> {
    private LinkedList<T> items;

    public Catalog() {
        this.items = new LinkedList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) {
        items.remove(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item.toString());
        }
    }

    public LinkedList<T> getItems() {
        return items;
    }
}
