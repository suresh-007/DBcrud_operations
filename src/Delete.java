import java.sql.*;
public class Delete
{
	public Delete()
	{
		try {
		 Class.forName("com.mysql.jdbc.Driver");
	      		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		 public void deleterow(int sno)
		 {
			 try
		 
		    {
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "");
			  int a=sno;
			  String query = "delete from user where sno = ?";
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      preparedStmt.setInt(1, a);
		      preparedStmt.execute();
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		 }
		 public void deletetable()
		 {
			 try
		 
		    {
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "");
			  String query = "TRUNCATE user ";
		      Statement stmt = conn.createStatement();
		      stmt.executeUpdate(query);
		      conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
		 }	
}
