public class Main {
    public static void main(String[] args) {

        DataProcessor csv = new CSVProcessor();
        DataProcessor json = new JSONProcessor();
        DataProcessor xml = new XMLProcessor();

        System.out.println("CSV");
        csv.process();
        System.out.println("JSON");
        json.process();
        System.out.println("XML");
        xml.process();
    }
}
