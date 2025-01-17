import java.util.*;

public class SavingAccount extends Account {
    private boolean overdrawn;

    SavingAccount(int id, double balance, Date createdDate, boolean overdrawn) {
        super(id, balance, createdDate);
        this.overdrawn = overdrawn;

    }

    @Override
    public String toString() {
        return super.toString() + "\nSaving account: "
                + overdrawn;
    }
}
