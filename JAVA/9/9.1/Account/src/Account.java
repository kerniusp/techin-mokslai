import java.util.*;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;

public class Account {

    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date createdDate;
    private String name;
    private ArrayList<Transaction> transaction;

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
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + " Was withdrew from your bank account");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void deposit(int depositAmount, Transaction transfers) {
        if (depositAmount > 0) {
            transfers.setAmount(depositAmount);
            balance += depositAmount;
            transfers.setBalance(balance);
            
        } else {
            System.out.println("Incorrect amount");
        }

    }


    @Override
    public String toString() {
        return "This is a bank account \n" +
                "id: " + id + "\n" +
                "balance: " + balance + "\n" +
                "annualInterestRate: " + annualInterestRate + "\n" +
                "createdDate: " + createdDate;
    }
}
