public class AnnualMembership extends Membership {

    public AnnualMembership(int membershipId, int memberId) {
        super();
    }

    @Override
    int getCost() {
        return 300;
    }

    @Override
    public String toString() {
        return "AnnualMembership, Cost: " + getCost() + ", Duration: 12 months";
    }
}
