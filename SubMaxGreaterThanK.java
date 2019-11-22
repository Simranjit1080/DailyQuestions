import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		System.out.println("Enter array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		System.out.println("Enter the integer");
		int k=s.nextInt();
		int count=0;
		int max;
		for(int x=0;x<n;x++)
		{
		    for(int y=0;y<n;y++)
		    {
		        max=a[x];
		        int f=0;
		        for(int z=x;z<=y;z++)
		        {
		            f=1;
		            if(a[z]>max)
		                max=a[z];
		        }
		        if(max>k && f==1)
		        count++;
		    }
		    
		}
		System.out.println("count="+count);
	}
}