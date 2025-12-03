import java.util.ArrayList;
import java.util.List;

public class JSONProcessor extends DataProcessor {

    private final List<String> data = new ArrayList<>();

    @Override
    protected void loadData() {
        System.out.println("Loading data from JSON...");
        data.add("{\"name\":\"apple\"}");
        data.add("{\"name\":\"banana\"}");
        data.add("{\"name\":\"cherry\"}");
    }

    @Override
    protected void transformData() {
        System.out.println("Adding timestamp to each JSON record...");
        long ts = System.currentTimeMillis();

        data.replaceAll(record -> record.replace("}", ", \"timestamp\": " + ts + "}"));
    }

    @Override
    protected void saveData() {
        System.out.println("Saving new JSON file:");
        data.forEach(System.out::println);
    }
}
