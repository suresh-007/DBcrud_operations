import java.io.*;
public class Main
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.println("1.file_DB\n2.Insert\n3.Display\n4.Update\n5.delete\n6.exit");
		
		while(true)
		{
			System.out.println("Enter Choice");
			int ch = Integer.parseInt(br.readLine());
			
		switch(ch)
		{
		case 1:
		{
			new File();break;
		}
		case 2:
		{
			System.out.println("Enter sno :");
			int sno = Integer.parseInt(br.readLine());
			System.out.println("Enter Name :");
			String name = br.readLine();
			System.out.println("Enter college_Name:");
			String college = br.readLine();
			new FiletoDB(sno,name,college);
			break;
		}
		
		case 3:
		{
			new Display();break;
		}
		case 4:
		{

			System.out.println("\nEnter sno to update");
			int sno = Integer.parseInt(br.readLine());
			new Update(sno);break;
		
		}
		case 5:
		{
			System.out.println("1.Delete a Row\n2.Delete Table");
			int ch1 = Integer.parseInt(br.readLine());
			switch(ch1)
			{
			case 1:
			{
				System.out.println("\nEnter sno to delete");
				int sno = Integer.parseInt(br.readLine());
				Delete delob=new Delete();
				delob.deleterow(sno);break;
			}
			case 2:
			{
				System.out.println("\nDeleteing Table");
				Delete delob = new Delete();
				delob.deletetable();break;
			}
			}break;
		}
		case 6:{
			System.out.println("...Exiting...");
		return;
		
		}
		default:System.out.println("***Invalied Choice***");
		}
		}

	}
}
