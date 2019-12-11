import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the size");
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int arr[]=new int[k];
		int f[]=new int[k];
		System.out.println("Enter elements");
		for(int i=0;i<k;i++)
		{
		    arr[i]=s.nextInt();
		}
	    String p[]=new String[k];
	    for(int i=0;i<k;i++)
	    {
	       p[i]=String.valueOf(arr[i]);
	    }
	    Arrays.sort(p);
	    String res="";
	    for(int i=k-1;i>=0;i--)
	    {
	        res=res+p[i];
	    }
	  System.out.println(res);
	}
}