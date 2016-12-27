package actions;


public class ActionManager {
    private boolean loggedIn;
    private String sessionId;
//    AuthenticationHandler authenticationHandler;

    public ActionManager(String username, String password){
        this.sessionId = BooklineActionHandler.login(username, password);
    }

    public ActionManager(String sessionId){
        this.sessionId = sessionId;
    }

    public void logout(){
        if(!loggedIn){
            return;
        }

    }

    public void activate(){
//        if(!loggedIn){
//            return;
//        }
        BooklineActionHandler.activate("0609001023751", sessionId);

    }

    public void deactivate(){
//        if(!loggedIn){
//            return;
//        }
        BooklineActionHandler.deactivate("2103982191", sessionId);
    }


}
