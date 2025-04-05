package ABB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Savee {

	public static void main(String[] args) {
		   try{  
			   
		    	Class.forName("oracle.jdbc.driver.OracleDriver");  
		    	Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","system","123");   
		    	PreparedStatement stmt=con.prepareStatement("insert into student(rollno,name,marks) values(?,?,?)");  
		    	stmt.setInt(1,1);
		    	stmt.setString(2,"Abhishek");
		    	stmt.setInt(3,98);
		    	int i=stmt.executeUpdate();  
		    	System.out.println(i+" records inserted");  
		    	con.close();
		     }
		catch(SQLException e)
		 {
		System.out.println(e);
		} 
		catch(ClassNotFoundException e)
		 {
		System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
