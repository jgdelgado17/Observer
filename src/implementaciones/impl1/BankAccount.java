package implementaciones.impl1;

public class BankAccount extends Observable {

    private double balance;

    public void addAmount(Double amount) {
        this.balance += amount;
        notifyObservers(balance);
    }

    public Double getBalance() {
        return balance;
    }

}
