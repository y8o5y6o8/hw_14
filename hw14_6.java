package JAVA14;
import java.io.*;

public class hw14_6 {

	public static void main(String[] args) {
		try
		{

			char data[] = new char[128];
			FileReader fr = new FileReader("C:\\Users\\r53wr\\OneDrive\\�ୱ\\����ɦV�{���]�p(java)\\java\\donkey.txt");
			int num = fr.read(data);
			String str = new String(data,0,num);
			 System.out.println("Characters read= "+num);
		      System.out.println(str);
		      
		      fr.close();
		}
		catch(IOException e)
		{}
	}

}
