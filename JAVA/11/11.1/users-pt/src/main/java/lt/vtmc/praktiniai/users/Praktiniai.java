package lt.vtmc.praktiniai.users;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {

        int userOlderThen25 = 0;

        for (User userai : users) {
            if (userai.getAge() > 25) {
                userOlderThen25++;
            }
        }

        return userOlderThen25;

    }

    public static double getAverageAge(List<User> users) {

        double averageAge = 0;

        for (User userai : users) {
            averageAge += userai.getAge();
        }
        return averageAge / users.size();

    }

    // TODO: Naudokite klase Collections.min(). Paduokite Comparator
    public static Integer getMinAge(List<User> users) {

        getMininumAge getMininumAge = new getMininumAge();

        return Collections.min(users, getMininumAge).getAge();

    }

    public static User findByName(List<User> users, String name) {
        
        for (int i = 0; i < users.size(); i++) {

            if (users.get(i).getName().equals(name)) {
                return users.get(i);
            }
        }

        return null;
    }

    // TODO: Naudokite klase Collections.sort(). Paduokite Comparator
    public static List<User> sortByAge(List<User> users) {

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return users;
    }

    // TODO: Naudokite klase Collections.max(). Paduokite Comparator
    public static User findOldest(List<User> users) {

        getOldestAge oldestAge = new getOldestAge();

        return Collections.max(users, oldestAge);

    }

    public static int sumAge(List<User> users) {

        int sum = 0;

        for (int i = 0; i < users.size(); i++) {
            sum += users.get(i).getAge();
        }

        return sum;
    }

}
