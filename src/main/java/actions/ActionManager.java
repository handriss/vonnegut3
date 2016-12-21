package actions;


public class ActionManager {
    private String username;
    private String password;

    public ActionManager(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void login(){
        Login login = new Login(username, password);
        login.authenticate();
    }

    public void logout(){

    }

    public void activate(){

    }

    public void deactivate(){

    }
}
