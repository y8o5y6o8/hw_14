package JAVA14;
import java.io.*;
public class hw14_8 {

	public static void main(String[] args) throws IOException
	{
		String str;
		FileReader fr = new FileReader("C:\Users\r53wr\OneDrive\�ୱ\\aaa.txt");
		FileReader fr1 = new FileReader("C:\Users\r53wr\OneDrive\�ୱ\\bbb.txt");
		FileWriter fr2 = new FileWriter("C:\Users\r53wr\OneDrive\�ୱ\\ccc.txt");
		BufferedReader bu = new BufferedReader(fr);
		BufferedReader bu1 = new BufferedReader(fr1);
		BufferedWriter bu2 = new BufferedWriter(fr2);
		while((str = bu.readLine())!=null)
		{
			bu2.write(str);
			bu2.newLine();
		}
		while((str = bu1.readLine())!=null)
		{
			bu2.write(str);
			bu2.newLine();
		}
		 bu2.flush();
		 fr.close();
		 fr1.close();
		 fr2.close();
	}

}
