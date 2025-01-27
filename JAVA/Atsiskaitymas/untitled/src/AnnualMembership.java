public class AnnualMembership extends Membership {

    public AnnualMembership(int membershipId, int memberId) {
        super();
    }

    @Override
    int getCost() {
        return 0;
    }

    @Override
    public String toString() {
        return "AnnualMembership, Cost: 300.0, Duration: 12 months";
    }
}
