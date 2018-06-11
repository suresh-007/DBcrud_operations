import java.sql.*;
public class Display
{
	Display()
	{
		 try
		    {
		      Class.forName("com.mysql.jdbc.Driver");
		      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "");
		      String query = "SELECT * FROM user";
		      Statement st = conn.createStatement();
		      ResultSet rs=st.executeQuery(query);
			
			while(rs.next())
			{
				int sno = rs.getInt("sno");
				String name = rs.getString("name");
				String college = rs.getString("college");
				System.out.format("%s %s %s\n",sno,name,college);	
			}

		     conn.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
	}

}
