import java.util.Scanner;

/**
 * Created by lombocska on 2016.12.21..
 */
public class ControlFromTerminal {

    // to try the project in console
    public static void main(String[] args) {
        System.out.println("username: ");
        Scanner usernameScanner = new Scanner(System.in);
        String username = usernameScanner.next();
        System.out.println("password: ");
        Scanner passwordScanner = new Scanner(System.in);
        String password = passwordScanner.next();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
