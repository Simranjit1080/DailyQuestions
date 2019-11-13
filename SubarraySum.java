import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=s.nextInt();
		int array[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++)
		{
		    array[i]=s.nextInt();
		}
		System.out.println("Enter the integer for comparison");
		int n=s.nextInt();
		int sum,flag=0;
		for(int i=0;i<size;i++)
		{
		    sum=0;
		    for(int j=i;j<size;j++)
		    {
		        sum=sum+array[j];
		        if(sum>n)
		        break;
		        if(sum==n)
		        {
		            System.out.println("starting index: "+i+", Ending index: "+j);
		            flag=1;
		            break;
		        }
		    }
		}
		if(flag==0)
		System.out.println("There is no such subarray");
	}
}

