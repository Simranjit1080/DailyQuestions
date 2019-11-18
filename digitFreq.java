import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=s.nextInt();
		}
		int count;
		System.out.println("Frequencies:");
		for(int i=0;i<size;i++)
		{
		    if(arr[i]==-999)
		    continue;
		    count=1;
		    for(int j=i+1;j<size;j++)
		    {
		        if(arr[i]==arr[j])
		        {
		            count++;
		            arr[j]=-999;
		        }
		    }
		    System.out.println(arr[i]+" "+count);
		}
	}
}