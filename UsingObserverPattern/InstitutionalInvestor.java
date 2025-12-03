public class InstitutionalInvestor implements Investor {
    private final String institutionName;

    public InstitutionalInvestor(String institutionName, Stock stock) {
        this.institutionName = institutionName;
        stock.addInvestor(this);
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Institution " + institutionName +
                " notified: " + stockSymbol + " price changed to $" + price);
    }
}