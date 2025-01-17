import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;

public class Account {

    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date createdDate;
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date = new Date();

    public Account() {

    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance, Date createdDate) {
        this.id = id;
        this.balance = balance;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getcreatedDate() {
        return createdDate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12.00);
    }

    public double getMonthlyInterest() {
        return (getMonthlyInterestRate() * balance) / 100;
    }

    public void withdraw(int withdrawAmount) {

        if (withdrawAmount <= balance || withdrawAmount <= 0) {

            Transaction listOfAddedDeposit = new Transaction('C',0,0,"Adding funds to the checking account");

            listOfAddedDeposit.setTransactionDate(date);
            listOfAddedDeposit.setAmount(withdrawAmount);

            balance -= withdrawAmount;

            listOfAddedDeposit.setBalance(balance);

            listOfAddedDeposit.setType('C');
            listOfAddedDeposit.setDescription("Withdrawing funds from checking account");

            transactions.add(listOfAddedDeposit);

            System.out.println(withdrawAmount + " Was withdrew from your bank account");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void deposit(int depositAmount) {
        if (depositAmount > 0) {

            Transaction listOfAddedDeposit = new Transaction('C',0,0,"Adding funds to the checking account");

            listOfAddedDeposit.setAmount(depositAmount);

            balance += depositAmount;

            listOfAddedDeposit.setBalance(balance);
            listOfAddedDeposit.setTransactionDate(date);
            listOfAddedDeposit.setType('C');
            listOfAddedDeposit.setDescription("Adding funds to checking account");

            transactions.add(listOfAddedDeposit);

            System.out.println(depositAmount + " Dollars Was added to your bank Account");
            
        } else {
            System.out.println("Incorrect amount");
        }

    }
    public void printAllTransactions(){

        for(int i = 0; i < transactions.size(); i++){
            System.out.println(transactions.get(i));
        }
    }


    @Override
    public String toString() {
        return "---Information--- \n" +
                "id: " + id + "\n" +
                "balance: " + balance + "\n" +
                "annualInterestRate: " + annualInterestRate + "\n" +
                "createdDate: " + createdDate +
                "\n-----------";
    }
}
