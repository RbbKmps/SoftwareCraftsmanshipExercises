import java.util.*;

public class XMLProcessor extends DataProcessor {

    private List<String> elements;

    @Override
    protected void load() {
        System.out.println("Loading XML data...");
        elements = Arrays.asList("<a>1</a>", "<b>2</b>", "<c>3</c>");
    }

    @Override
    protected void transform() {
        System.out.println("Transforming XML: stripping tags...");
        elements = elements.stream()
                .map(x -> x.replaceAll("<.*?>", ""))  // remove XML tags
                .toList();
    }

    @Override
    protected void save() {
        System.out.println("Saving XML data...");
        System.out.println(elements);
    }
}
