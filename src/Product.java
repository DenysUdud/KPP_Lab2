import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Product {
    private String name;
    private String unit;
    private int quantity;
    private double pricePerUnit;
    private Date arrivalDate;
    private Map<String, String> description;

    public Product(String name, String unit, int quantity, double pricePerUnit, Date arrivalDate) {
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.arrivalDate = arrivalDate;
        this.description = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public Map<String, String> getDescription() {
        return description;
    }

    public void addDescription(String property, String value) {
        description.put(property, value);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", quantity=" + quantity +
                ", pricePerUnit=" + pricePerUnit +
                ", arrivalDate=" + arrivalDate +
                ", description=" + description +
                '}';
    }
}
