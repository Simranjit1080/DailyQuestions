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
		    System.out.println("not anagrams");
		    return;
		}
		Arrays.sort(aa);
		Arrays.sort(ba);
		for(int i=0;i<lena;i++)
		{
		    if(aa[i]!=ba[i])
		    {
		    System.out.println("not anagrams");
		    return;
		    }
		}
		System.out.println("anagrams");
	}
}