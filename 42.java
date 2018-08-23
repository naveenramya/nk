import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
        System.out.println("enter string1");
        String s1=sc.nextLine();
        System.out.println("enter string2");
        String s2=sc.nextLine();
        if(s1.equals(s2))
        {
           System.out.println("strings are equal");
        }
        else
        {
           System.out.println("strings are not equal");
        }    
	}
}
