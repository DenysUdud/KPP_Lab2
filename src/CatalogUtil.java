import java.util.Collections;
import java.util.Comparator;

public class CatalogUtil {
    public static <T> void sortByName(Catalog<T> catalog) {
        Collections.sort(catalog.getItems(), Comparator.comparing(item -> ((Product) item).getName()));
    }

    public static <T> void sortByPrice(Catalog<T> catalog) {
        Collections.sort(catalog.getItems(), Comparator.comparing(item -> ((Product) item).getPricePerUnit()));
    }

    public static <T> void sortByArrivalDate(Catalog<T> catalog) {
        Collections.sort(catalog.getItems(), Comparator.comparing(item -> ((Product) item).getArrivalDate()));
    }
}
