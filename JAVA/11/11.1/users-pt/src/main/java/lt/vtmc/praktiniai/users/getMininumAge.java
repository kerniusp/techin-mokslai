package lt.vtmc.praktiniai.users;

import java.util.Comparator;

public class getMininumAge implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
