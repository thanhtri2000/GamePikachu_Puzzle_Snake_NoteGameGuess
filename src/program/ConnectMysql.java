package program;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectMysql {
  public static void main(String[]args) throws SQLException {
	  try {
	  Class.forName("com.mysql.jdbc.Driver");
	  String url="jdbc:mysql://localhost:3306/qlminigame2?useSSL=false";
	  String user="root";
	  String password="0123456789";
	  Connection  connection = (Connection) DriverManager.getConnection(url,user,password) ;
	  System.out.printf("Successfully");
	  
	  }catch(ClassNotFoundException e) {
		  System.out.printf("Error");
		  e.printStackTrace();
	  }
	  	  
  }

public static Connection dbConnector() {
	// TODO Auto-generated method stub
	return null;
}

}
