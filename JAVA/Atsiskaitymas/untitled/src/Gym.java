import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Gym {

    HashMap<Integer, Member> members;
    Member member;
    List<Membership> memberships;
    List<GymClass> gymclasses;

    public Gym() {
        members = new HashMap<>();
        memberships = new ArrayList<>();
        gymclasses = new ArrayList<>();
    }

    public void addMemeber(int id, String name, int age) {

        member = new Member(id, name, age);

        members.put(member.getId(), member);

    }

    public void printMemebers() {

        System.out.print("Memebers: \n");

        members.forEach((id, memberObj) -> System.out.println(id + ": " + memberObj.getName() + ", Age: " + memberObj.getAge()));

    }

    public void assignMembership(Membership t) {
        memberships.add(t);
    }

    public void printMemberships() {

        System.out.println("Memeberships: ");
        memberships.forEach(value -> System.out.println(value));
    }

    public void addGymClass(String className, String schedule) {

        GymClass gymclass = new GymClass(className, schedule);
        gymclasses.add(gymclass);

    }

    public void enrollMemberInClass(int id, String className) {

        for (int i = 0; i < members.size(); i++) {
            if (members.containsKey(id)) {

                System.out.println(members.get(id).getName());

            }
        }
    }

    public void printClassEnrollments() {
        gymclasses.forEach(value -> System.out.println(value));
    }


}
