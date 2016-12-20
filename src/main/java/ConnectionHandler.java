
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHandler {
    private String serverName = "localhost";
    private String portNumber = "3306";
    private String username = "root";
    private String password = "root";
    private Connection connection;
    public ConnectionHandler(){
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.username);
        connectionProps.put("password", this.password);
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + this.serverName + ":" + this.portNumber + "/", connectionProps);
            System.out.println("Successfully connected to " + this.serverName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.connection = conn;
    }
}

