import java.sql.Connection;
import java.sql.DriverManager;

public class SqlData {

    public static void main(String[] args) {
        
        Connection conn = DriverManager.getConnection("mysql:localhost");

    }
    
}
