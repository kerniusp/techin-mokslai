import com.sun.source.tree.NewArrayTree;

public class Main {
    public static void main(String[] args) {

        Gym gym = new Gym();

        gym.addMemeber(1, "Alice", 30);
        gym.addMemeber(2, "Bob", 25);
        gym.addMemeber(3, "Jeff", 58);

        gym.printMembers();
        System.out.println("---");

        gym.assignMembership(new MonthlyMembership(1, 1, 2));
        gym.assignMembership(new AnnualMembership(2, 2));
        gym.assignMembership(new MonthlyMembership(3, 5, 6));

        gym.printMemberships();
        System.out.println("---");

        gym.addGymClass("Yoga", "Monday 6 PM");
        gym.addGymClass("Zumba", "Wednesday 7 PM");


        gym.enrollMemberInClass(1, "Yoga");
        gym.enrollMemberInClass(2, "Zumba");
        gym.enrollMemberInClass(3, "Yoga");


        gym.printClassEnrollments();


    }
}