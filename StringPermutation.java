import java.util.*;
public class Main 
{ 
    public static void strPerm(String str,int l,int r) 
    { 
        if (l==r) 
            System.out.print(str+" "); 
        else
        { 
            for (int i=l;i<=r;i++) 
            { 
                str=swap(str,l,i); 
                strPerm(str,l+1,r); 
                str=swap(str,l,i); 
            } 
        } 
    } 
    public static String swap(String a,int i,int j) 
    { 
        char temp; 
        char[] c = a.toCharArray(); 
        temp = c[i] ; 
        c[i] = c[j]; 
        c[j] = temp; 
        return String.valueOf(c); 
    } 
    public static void main(String[] args) 
    { 
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t--!=0)
        {
        String str = s.next(); 
        int n = str.length(); 
        strPerm(str,0,n-1);
        }
    } 
}