public class Main {
    public static void main(String[] args) {

        ConcreteStock apple = new ConcreteStock("AAPL", 150.00);

        Investor alice = new IndividualInvestor("Alice", apple);
        Investor bigBank = new InstitutionalInvestor("BigBank Capital", apple);

        apple.setPrice(152.45);

        apple.removeInvestor(alice);

        apple.setPrice(160.00);
    }
}