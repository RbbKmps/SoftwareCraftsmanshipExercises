import java.util.ArrayList;
import java.util.List;

public class CSVProcessor extends DataProcessor {

    private final List<String> data = new ArrayList<>();

    @Override
    protected void load() {
        System.out.println("Loading data from CSV...");
        data.add("apple");
        data.add("banana");
        data.add("cherry");
    }

    @Override
    protected void transform() {
        System.out.println("Transforming CSV data to upper-case...");
        data.replaceAll(String::toUpperCase);
    }

    @Override
    protected void save() {
        System.out.println("Saving new CSV file:");
        data.forEach(System.out::println);
    }
}
