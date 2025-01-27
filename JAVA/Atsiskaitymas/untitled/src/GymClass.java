import java.util.ArrayList;
import java.util.List;

public class GymClass {

    private String className;
    private String schedule;
    private String enrolledMembers;
    private List<Member> enrolledList;

    public GymClass(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
        enrolledList = new ArrayList<>();
    }

    public void enroll(Member objectOfMember) {
        enrolledList.add(objectOfMember);
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }


    @Override
    public String toString() {
        String result = className + " (" + schedule + ")";
        if (!enrolledList.isEmpty()) {
            result += " ";
            for (int i = 0; i < enrolledList.size(); i++) {
                result += enrolledList.get(i).getName();
                if (i < enrolledList.size() - 1) {
                    result += ", ";
                }
            }
        }
        return result;
    }
}



