import java.util.ArrayList;
import java.util.List;

public class ConcreteStock implements Stock {
    private final String symbol;
    private double price;
    private final List<Investor> investors = new ArrayList<>();

    public ConcreteStock(String symbol, double initialPrice) {
        this.symbol = symbol;
        this.price = initialPrice;
    }

    @Override
    public void addInvestor(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(symbol, price);
        }
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyInvestors();
    }
}