import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		int flag=0;
		System.out.print("Leaders: ");
		for(int i=0;i<n-1;i++)
		{
		    flag=0;
		    for(int j=i;j<n;j++)
		    {
		        if(a[i]<a[j])
		        {
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0)
		    {
		        System.out.print(a[i]+" ");
		    }
		}
		System.out.print(a[n-1]);
	}
}