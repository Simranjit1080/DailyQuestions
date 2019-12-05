import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int a=2;
		int pf=2;
		while(k!=0)
		{
		    if(k%a!=0)
		    {
		        a++;
		    }
		    else
		    {
		        pf=a;
		        k=k/a;
		        if(k==1)
		        {
		            System.out.println("highest prime factor="+pf);
		            break;
		        }
		    }
		}
	}
}