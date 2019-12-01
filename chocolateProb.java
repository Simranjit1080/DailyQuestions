import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		System.out.println("enter no. of students");
		int m=s.nextInt();
		Arrays.sort(arr);
		int diff=9999;
		for(int i=0;i<n-m+1;i++)
		{
		    if((arr[i+m-1]-arr[i])<diff)
		    {
		        diff=arr[i+m-1]-arr[i];
		    }
		}
		System.out.println("min="+diff);
	}
}