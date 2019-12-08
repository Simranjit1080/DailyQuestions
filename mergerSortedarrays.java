import java.util.*;
public class Main 
{
	public static void main(String args[])
	{
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int n=s.nextInt();
		System.out.println("Enter size of second array");
		int m=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		System.out.println("Enter elements of first array");
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		System.out.println("Enter elements of second array");
		for(int i=0;i<m;i++)
		{
		    b[i]=s.nextInt();
		}
	    int c[]=new int[n+m];
	    int k=0;
	    for(int i=0;i<n;i++)
	    {
	        c[k]=a[i];
	        k++;
	    }
	    for(int i=0;i<m;i++)
	    {
	        c[k]=b[i];
	        k++;
	    }
	    Arrays.sort(c);
	    for(int i=0;i<n+m;i++)
	    {
	        System.out.print(c[i]+" ");
	    }
	}

}