import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=new String();
		System.out.println("enter the string");
		str=s.nextLine();
		if((str.length()&1)==1)
		{
		    System.out.println("Not Balanced");
		    return;
		}
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
		    char k=str.charAt(i);
		    if(k=='{'|| k=='[' || k=='(')
		    {
		        st.push(k);
		    }
		    else if((k=='}'&& st.peek()=='{') ||(k==']' && st.peek()=='[') || (k==')' && st.peek()=='('))
		    {
		        st.pop();
		    }
		}
		if(st.empty())
		{
		    System.out.println("Balanced");
		}
		else
		{
		System.out.println("Not Balanced");
		}
	}
}
