import java.util.*;


public class Main {
    public static void main(String[] args) {

        Date accountCreatedDate = new Date(2025, 02, 17);

        Account testAccount = new Account("George",1122,1000);
        testAccount.setAnnualInterestRate(1.5);


        testAccount.deposit(30);
        testAccount.deposit(40);
        testAccount.deposit(50);

        testAccount.withdraw(5);
        testAccount.withdraw(4);
        testAccount.withdraw(2);

        System.out.println(testAccount);
        testAccount.printAllTransactions();
    }
}