package JAVA14;
//hw14_3,
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class hw14_3
{
public static void main(String args[]) throws IOException
{
   int n,sum=0;
   BufferedReader buf;
   String str;
   buf=new BufferedReader(new InputStreamReader(System.in));

   System.out.print("��J�@�Ӿ��: ");
   str=buf.readLine();
   n=Integer.parseInt(str);

   for(int i=1;i<=n;i++)
      sum+=i;
   System.out.println("1+2+...+"+n+"="+sum);
}
}

/* output--------------------
��J�@�Ӿ��: 10
1+2+...+10=55
---------------------------*/
