public abstract class Membership {
    private int membershipId;
    private int memberId;

    public Membership() {
        this.membershipId = membershipId;
        this.memberId = memberId;
    }

    abstract int getCost();


    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

}
