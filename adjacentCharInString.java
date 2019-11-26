import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner s =new Scanner(System.in);
		String str=s.next();
		String str1="";
		int length=str.length();
		if(str.charAt(0)!=str.charAt(1))
		{
		    str1=str1+str.charAt(0);
		}
		for(int i=1;i<length-1;i++)
		{
		    if(str.charAt(i)!=str.charAt(i+1) && str.charAt(i)!=str.charAt(i-1))
		    {
		        str1=str1+str.charAt(i);
		    }
		}
		if(str.charAt(length-1)!=str.charAt(length-2))
		{
		    str1=str1+str.charAt(length-1);
		}
		System.out.println("output:"+str1);
	}
}

