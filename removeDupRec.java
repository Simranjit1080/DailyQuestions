import java.util.*;
public class Main
{
     static String removeDup(String str, char l) 
     {
             if (str.length() == 0 || str.length() == 1) 
                {
                    return str; 
                }
             if (str.charAt(0) == str.charAt(1)) 
             { 
                 l = str.charAt(0); 
                 while (str.length() > 1 && str.charAt(0) == str.charAt(1)) 
                    {
                        str = str.substring(1, str.length()); 
                    }
                 str = str.substring(1, str.length()); 
                 return removeDup(str, l);  
             } 
             String str2 = removeDup(str.substring(1,str.length()), l); 
             if (str2.length() != 0 && str2.charAt(0) == str.charAt(0)) 
             { 
                l = str.charAt(0); 
                return str2.substring(1,str2.length());
             }  
             if (str2.length() == 0 && l == str.charAt(0)) 
                 {
                     return str2; 
                 }
             return (str.charAt(0) + str2); 
      } 
   
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.next();
		System.out.println(removeDup(st,'\0'));
	}
}

