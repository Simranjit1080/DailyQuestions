import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		char aa[]=a.toLowerCase().toCharArray();
		char ba[]=b.toLowerCase().toCharArray();
		int lena=aa.length;
		int lenb=ba.length;
		if(lena!=lenb)
		{
		    System.out.println("not anagram a");
		    return;
		}
		Arrays.sort(aa);
		Arrays.sort(ba);
		for(int i=0;i<lena;i++)
		{
		    if(aa[i]!=ba[i] && aa[i]!=ba[i]+32 && aa[i]!=ba[i]-32)
		    {
		    System.out.println("not anagram b");
		    return;
		    }
		}
		System.out.println("anagram");
	}
}