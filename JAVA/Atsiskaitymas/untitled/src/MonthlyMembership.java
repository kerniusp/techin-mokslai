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
        return duration * 30;
    }

    @Override
    public String toString() {
        return "MonthlyMembership, " + "Cost: " + getCost() + ", Duration: " + duration + " months";
    }
}
