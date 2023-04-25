package implementaciones.impl1;

public class BankExpense implements Observer {
    private String type;
    private double totalCalculated;
    private final double rateCoefficient;

    public BankExpense(String type, double rateCoefficient) {
        this.type = type;
        this.rateCoefficient = rateCoefficient;
    }

    @Override
    public void update(Object value) {
        this.totalCalculated = ((Double) value) * rateCoefficient;
    }

    public Double getTotalCalculated() {
        return totalCalculated;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "BankExpense [type=" + type + ", totalCalculated=" + totalCalculated + ", rateCoefficient="
                + rateCoefficient + "]";
    }
}
