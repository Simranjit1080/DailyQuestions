import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter prefix string");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1="";
		String s1="";
		String s2="";
		Stack<String> st=new Stack<String>();
		for(int i=str.length()-1;i>=0;i--)
		{
		    char k= str.charAt(i);
		    if(k>='a'&&k<='z' || k>='A' && k<='Z')
		    {
		        String temp="";
		        temp=temp+k;
		        st.push(temp);
		    }
		    else
		    {
		        if(!st.empty())
		        s1=st.pop();
		        if(!st.empty())
		        s2=st.pop();
		        str1=s1+s2+k;
		        st.push(str1);
		    }
		}
		System.out.println("Postfix:"+st.pop());
	}
}