
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username1 = "alex";
        String password1 = "sunshine";

        String username2 = "emma";
        String password2 = "haskell";

        String username = "alex";
        String password = "sunshine";

        if (username.equals(username1) || username.equals(username2) && password.equals(password1) || password.equals(password2)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
