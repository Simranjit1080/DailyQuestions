import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        String p=new String();
		System.out.println("Enter string");
		p=s.nextLine();
	    StringBuilder str=new StringBuilder(p);
		char ch[]=new char[str.length()];
		int k=0;
		for(int i=0;i<str.length();i++)
		{
		    if(Character.isAlphabetic(str.charAt(i)))
		    {
		        ch[k]=str.charAt(i);
		        k++;
		    }
		}
		k=0;
		for(int i=str.length()-1;i>=0;i--)
		{
		    if(Character.isAlphabetic(str.charAt(i)))
		    {
		    str.setCharAt(i,ch[k]);
		    k++;
		    }
		}
		System.out.println(str.toString());
	}
}