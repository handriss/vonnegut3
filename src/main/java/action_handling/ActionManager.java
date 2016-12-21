package action_handling;


import action_handling.actions.BookStatusHandler;
import action_handling.actions.Login;

import java.util.Objects;

public class ActionManager {
    private String username;
    private String password;
    private boolean loggedIn;
    private String sessionId;

    public ActionManager(String username, String password){
        this.username = username;
        this.password = password;
        loggedIn = false;
    }

    public void login(){
        Login login = new Login(username, password);
        String result = login.authenticate();

        if(!Objects.equals( result, "Unsuccessful")){
            loggedIn = true;
            sessionId = result;
        }

        System.out.println(sessionId);
    }

    public void logout(){

    }

    public void activate(){
        if(!loggedIn){
            return;
        }
        BookStatusHandler.activate("0609001023751", sessionId);
    }

    public void deactivate(){
        if(!loggedIn){
            return;
        }
        BookStatusHandler.deactivate("2103982191", sessionId);
    }
}
