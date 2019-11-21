import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		System.out.println("Enter the size of subarray");
		int k=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		System.out.println("");
		int b[]=new int[k];
		int x;
		for(int i=0;i<=n-k;i++)
		{
		    x=0;
		    for(int j=i;j<k+i;j++)
		    {
		        b[x]=a[j];
		        x++;
		    }
		    int max=b[0];
		    for(int z=1;z<k;z++)
		    {
		        if(b[z]>max)
		        {
		            max=b[z];
		        }
		    }
		    System.out.print(max+" ");
		}
	}
}