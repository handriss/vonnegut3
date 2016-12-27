package actions;


public class ActionManager {
    private boolean loggedIn;
    private String sessionId;

    {
        loggedIn = false;
    }

    public ActionManager(String username, String password){
        this.sessionId = BooklineActionHandler.login(username, password);
        if (sessionId != "") {
            System.out.println("sikeres bejelentkezés");
            loggedIn = true;
        } else {
            System.out.println("nem sikeres bejelentkezés");
        }
    }

    public void logout(){
        if(!loggedIn){
            System.out.println("you aren't loggedIn");
            return;
        }
        loggedIn = false;
        BooklineActionHandler.logout(sessionId);
    }

    public void activate(){
        if(!loggedIn){
            System.out.println("you aren't loggedIn");
            return;
        }
        BooklineActionHandler.activate("0609001023751", sessionId);

    }

    public void deactivate(){
        if(!loggedIn){
            System.out.println("you aren't loggedIn");
            return;
        }
        BooklineActionHandler.deactivate("2103982191", sessionId);
    }


}
