import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,count=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num>0)
		{
			num=num/10;
			count=count+1;
		}
		System.out.println(count);
		
		}
	}

	
	
