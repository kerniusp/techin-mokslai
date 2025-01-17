import java.util.*;

public class Main {
    public static void main(String[] args) {

        Date AccountCreatedDate = new Date(2025, 02, 17);

        Account justAcc = new Account(1, 20_000, AccountCreatedDate);
        Account savingAcc = new SavingAccount(2, 50_000, AccountCreatedDate, true);
        Account checkingAcc = new CheckingAccount(3, 100_000, AccountCreatedDate, true);

        justAcc.setAnnualInterestRate(4.5);

        System.out.println(checkingAcc);

        System.out.println(justAcc.getMonthlyInterest());
        System.out.println(justAcc.getMonthlyInterestRate());
        
    }
}