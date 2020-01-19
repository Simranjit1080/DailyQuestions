import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{
		String st=s.next();
		String a[]=st.split("\\.",0);
		for(int i=a.length-1;i>=0;i--)
		{
		    System.out.print(a[i]);
		    if(i!=0)
		    System.out.print(".");
		}
		}
	}
}
