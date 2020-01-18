import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        for(int k=0;k<n;k++)
		        {
		            if(a[i]*a[i]+a[j]*a[j]==a[k]*a[k])
		            {
		                System.out.println("Yes  "+a[i]+"^2+"+a[j]+"^2="+a[k]+"^2");
		                return;
		            }
		        }
		    }
		}
		System.out.println("No");
		}
	}
}