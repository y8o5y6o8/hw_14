package JAVA14;
//hw14_4,
import java.io.*;
public class hw14_4
{
public static void main(String args[]) throws IOException
{
   char data[]=new char[128];
   FileReader fr=new FileReader("c:\\Java\\donkey.txt");

   int num=fr.read(data);
   String str=new String(data,0,num);
   System.out.println("Characters read= "+num);
   System.out.println(str);

   fr.close();
}
}

/* output-------------------
Characters read= 30
�ڦ��@���p���j
�ڱq�Ӥ]���M
���@�ѧڤߦ�Ӽ��M�ۥh����
--------------------------*/