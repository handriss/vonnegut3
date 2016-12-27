import actions.ActionManager;

import java.util.Scanner;


public class ControlFromTerminal {

    // to try the project in console
    public static void main(String[] args) {
        System.out.println("username: ");
        Scanner usernameScanner = new Scanner(System.in);
        String username = usernameScanner.next();
        System.out.println("password: ");
        Scanner passwordScanner = new Scanner(System.in);
        String password = passwordScanner.next();


        // login
        ActionManager actionManager = new ActionManager(username, password);
//        actionManager.login();

        Scanner choose = new Scanner(System.in);
        String choice= null;
        while (!"end".equals(choice)) {
            System.out.println("\nType 1, 2, or 3 and press enter to see the monthly payment information for the respective loan. To end the program type \"end\".");
            choice = choose.nextLine();
            if ("1".equals(choice)) {
                System.out.println("chosen activate method" );
                actionManager.activate();
            }
            if ("2".equals(choice)) {
                System.out.println("chosen deactivate method" );
                actionManager.deactivate();
            }
            if ("3".equals(choice)) {
                System.out.println("chosen logout" );
//                actionManager.logout();
            }
//            if ("4".equals(choice)) {
//                System.out.println("choosed logout: " );
//
//            }
        }
        choose.close();
    }
}
