import java.sql.*;
public class FiletoDB
{
	public FiletoDB(int sno,String name,String college)
	{
		int a=sno;
		String b=name;
		String c=college;
		insert(a,b,c);
	}
    
    public void insert(int sno,String name,String college)
    {
    try
    {
    	
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "");
      String query="INSERT INTO user VALUES("+sno+",'"+name+"','"+college+"')";
      Statement st = conn.createStatement();
      int count=st.executeUpdate(query);
	System.out.println(count+"rows Effected");

      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }

  }
}

