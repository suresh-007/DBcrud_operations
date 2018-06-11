import java.io.*;
public class File 
{
	public File() 
	{
		try
		{
			FileReader fileReaderObj = new FileReader("Data.txt");
			
			BufferedReader br = new BufferedReader(fileReaderObj);		
			String eachLine;
			while( (eachLine = br.readLine()) != null) 
			{
				String[] tmpLineSplitedObjects = eachLine.split(" ");
				int sno = Integer.parseInt(tmpLineSplitedObjects[0]);
				String name = tmpLineSplitedObjects[1];
				String college = tmpLineSplitedObjects[2];
				//System.out.println(sno+" "+name+" "+college);
				new FiletoDB(sno,name,college);
			}
			br.close();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
		