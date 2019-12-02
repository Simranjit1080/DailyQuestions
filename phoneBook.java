import java.util.HashMap;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		HashMap<String,String> hash=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("number of enteries:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{

			System.out.println("name:");
			String name=sc.next();
			System.out.println("Phone number:");
			String phone=sc.next();
			hash.put(name, phone);
		}
		System.out.println("number of queries:");
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			System.out.println("Enter name:");
			String name=sc.next();
		if(hash.get(name)!=null)
		{
			System.out.println(name+"="+hash.get(name));
		}
		else
		{
			System.out.println("Not Found");
		}
		}
	}

}