import java.util.Date;

public class CheckingAccount extends Account {
    private boolean overdraftLimit;

    public CheckingAccount(int id, double balance, Date createdDate, boolean overdraftLimit) {
        super(id, balance, createdDate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOveredraft Limit: "
                + overdraftLimit;
    }
}
