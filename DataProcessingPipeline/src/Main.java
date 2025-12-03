public class Main {
    public static void main(String[] args) {

        DataProcessor csv = new CSVProcessor();
        DataProcessor json = new JSONProcessor();

        csv.process();

        json.process();
    }
}
