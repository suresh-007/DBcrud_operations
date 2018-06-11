import java.io.*;
import java.sql.*;
public class Update 
{
	public Update(int sno)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		try 
		{
			  Class.forName("com.mysql.jdbc.Driver");
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "");
			  int a=sno;
				System.out.println("Enter Name :");
				String name = br.readLine();
				System.out.println("Enter college_Name:");
				String college = br.readLine();
		        String query="UPDATE user SET name = ?,college = ? WHERE sno = ?" ;
				 PreparedStatement preparedStmt = conn.prepareStatement(query);
				 preparedStmt.setString(1, name);
				 preparedStmt.setString(2, college);
				 preparedStmt.setInt(3, a);
		       
		      preparedStmt.execute();
		      conn.close();
		  }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		
		    	
	
	}

}
