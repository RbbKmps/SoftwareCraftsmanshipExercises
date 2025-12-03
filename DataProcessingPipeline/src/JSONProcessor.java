import java.util.*;

public class JSONProcessor extends DataProcessor {

    private Map<String, Object> data;

    @Override
    protected void load() {
        System.out.println("Loading data from JSON...");
        data = new HashMap<>();
        data.put("name", "Laptop");
        data.put("price", 1200);
    }

    @Override
    protected void transform() {
        System.out.println("Adding timestamp to JSON...");
        data.put("timestamp", System.currentTimeMillis());
    }

    @Override
    protected void save() {
        System.out.println("Saving JSON data...");
        System.out.println(data);
    }

    @Override
    protected boolean validateData() {
        System.out.println("Validating JSON data...");
        return data.containsKey("name");
    }
}
