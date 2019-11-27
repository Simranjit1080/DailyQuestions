import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first array size");
		int n=s.nextInt();
		System.out.println("Enter second array size");
        int m=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        System.out.println("Enter the integer");
	    int x=s.nextInt();
	    System.out.println("Enter first array elements");
	    for(int i=0;i<n;i++)
	    a[i]=s.nextInt();
	    System.out.println("Enter second array elements");
	    for(int i=0;i<m;i++)
	    b[i]=s.nextInt();
	    
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<m;j++)
	        {
	            if(a[i]+b[j]==x)
	            {
	                System.out.print(a[i]+" "+b[j]+", ");
	            }
	        }
	    }
	}   
}