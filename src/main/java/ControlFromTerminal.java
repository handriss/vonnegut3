import action_handling.ActionManager;
import action_handling.actions.AuthenticationHandler;


public class ControlFromTerminal {

    // to try the project in console
    public static void main(String[] args) {
//        System.out.println("username: ");
//        Scanner usernameScanner = new Scanner(System.in);
//        String username = usernameScanner.next();
//        System.out.println("password: ");
//        Scanner passwordScanner = new Scanner(System.in);
//        String password = passwordScanner.next();

        String username = "menyhard";
        String password = "nickhornby1";
        // login
        AuthenticationHandler handler = new AuthenticationHandler(username, password);
        ActionManager actionManager = new ActionManager(handler.login());
        actionManager.activate();
    }
}
