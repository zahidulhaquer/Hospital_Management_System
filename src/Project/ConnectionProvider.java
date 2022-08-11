

package Project;
import java.sql.*;
/**
 *
 * @author Zahidul Haque
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123456");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
