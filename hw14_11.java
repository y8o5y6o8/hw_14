package JAVA14;
import java.io.*;

public class hw14_11 {

	public static void main(String[] args) throws IOException
	{
		int count=1;
		FileInputStream fi = new FileInputStream("C:\\Users\\r53wr\\OneDrive\\�ୱ\\number.txt");
		
		byte data[]=new byte[fi.available()];
		fi.read(data);
		
		 for(int i=0;i<data.length;i++)
		 {
			 if(data[i]=='\n')
			 {
				 count++;
			 }
		 }
		 System.out.println(new String(data));
		 System.out.println(count+" lines read");
	}

}