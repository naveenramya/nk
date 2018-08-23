import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class StringDemo 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int k,i;
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		k=sc.nextInt();
		for(i=0;i<k;i++)
		{
			System.out.println(str); 
		}
	}
}
