package JAVA14;

import java.io.*;
public class hw14_9 {

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\r53wr\\OneDrive\\�ୱ\\aaa.txt");
		FileReader fr1 = new FileReader("C:\\Users\\r53wr\\OneDrive\\�ୱ\\bbb.txt");
		FileReader fr2 = new FileReader("C:\\Users\\r53wr\\OneDrive\\�ୱ\\ccc.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		String str;
		System.out.println("aaa.txt");
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
		}
		System.out.println("bbb.txt");
		while((str = br1.readLine())!=null)
		{
			System.out.println(str);
		}
		System.out.println("ccc.txt");
		while((str = br2.readLine())!=null)
		{
			System.out.println(str);
		}
		fr.close();
		fr1.close();
		fr2.close();
	}

}
