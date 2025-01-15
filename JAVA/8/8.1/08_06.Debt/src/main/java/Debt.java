public class Debt {

    private double balance;
    private double interestRate;

    public Debt(double intialBalance, double initialInterestRate) {
        balance = intialBalance;
        interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(balance);
    }

    public void waitOneYear() {
        balance = balance * interestRate;
    }
}
