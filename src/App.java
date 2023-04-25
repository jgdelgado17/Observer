import implementaciones.impl1.BankAccount;
import implementaciones.impl1.BankExpense;
import implementaciones.impl2.BankAccountSubject;
import implementaciones.impl2.BankExpenseObserver;

public class App {
    public static void main(String[] args) throws Exception {
        implementacion1();
    }

    private static void implementacion1() {
        // Observable class
        BankAccount bankAccount = new BankAccount();

        // Observer class
        BankExpense bankExpense1 = new BankExpense("commission", 0.11);
        BankExpense bankExpense2 = new BankExpense("expense", 0.22);
        BankExpense bankExpense3 = new BankExpense("compensation", 0.33);

        // Add Observer into Observable
        bankAccount.addObserver(bankExpense1);
        bankAccount.addObserver(bankExpense2);
        bankAccount.addObserver(bankExpense3);

        // Change Observable state
        bankAccount.addAmount(1000d);

        // Observer was notified
        System.out.println(bankExpense1.toString());
        System.out.println(bankExpense2.toString());
        System.out.println(bankExpense3.toString());
    }

    private static void implementacion2() {
        // Observable class
        BankAccountSubject bankAccount = new BankAccountSubject();

        // Observer class
        BankExpenseObserver bankExpense1 = new BankExpenseObserver("commission", 0.11);
        BankExpenseObserver bankExpense2 = new BankExpenseObserver("expense", 0.22);
        BankExpenseObserver bankExpense3 = new BankExpenseObserver("compensation", 0.33);

        // Add Observer into Observable
        bankAccount.addObserver(bankExpense1);
        bankAccount.addObserver(bankExpense2);
        bankAccount.addObserver(bankExpense3);

        // Change Observable state
        bankAccount.addAmount(1000d);

        // Observer was notified
        System.out.println(bankExpense1.toString());
        System.out.println(bankExpense2.toString());
        System.out.println(bankExpense3.toString());
    }
}
