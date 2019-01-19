import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws SQLException {

		/**Difference between Builder and Factory:
		 * Builder is used to create different objects
		 * Yet Factory is used to create an object which will rarely change. 
		 * Example: Object of database config. 
		 */
		Connection c = new ConnectionFactory().getConnection();
		PreparedStatement ps = c.prepareStatement("select * from table");
		
		
	}

}
