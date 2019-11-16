import java.util.*;
public class Main
{
    public static int palindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }
            else
            return 0;
        }
        return 1;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str= new String();
		System.out.println("Enter String");
		str=s.nextLine();
		String pd="";
	    for(int i=0;i<str.length();i++)
	    {
	        for(int j=i+1;j<=str.length();j++)
	        {
	            String k=str.substring(i,j);
	            if(palindrome(k)==1 && (k.length()>pd.length()))
	            pd=k;
	        }
	    }
	    if(pd.length()>1)
	    System.out.println("Palindrome:"+pd);
	    else
	    System.out.println("No palindrome");
	}
}