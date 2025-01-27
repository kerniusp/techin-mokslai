public class MonthlyMembership extends Membership {
    private int duration;

    public MonthlyMembership(int membershipId, int memberId, int duration) {
        super();
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    int getCost() {
        return 0;
    }

    @Override
    public String toString() {
        return "MonthlyMembership, " + "Cost: " + duration * 30 + ", Duration: " + duration + " months";
    }
}
