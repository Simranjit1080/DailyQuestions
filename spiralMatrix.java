import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter size of square Matrix");
    int l=s.nextInt();
    int p=0;
    int arr[][]=new int[l][l];
    for(int i=0;i<l;i++)
    {
        for(int j=0;j<l;j++)
        {
            arr[i][j]=s.nextInt();
        }
    }
   for(int k=0;k<l/2;k++)
    {
        for(int c=0+p;c<l-p;c++)
        {
            System.out.print(arr[0+p][c]+" ");
        }
        for(int r=1+p;r<l-p;r++)
        {
            System.out.print(arr[r][l-1-p]+" ");
        }
        for(int c=l-2-p;c>=0+p;c--)
        {
            System.out.print(arr[l-1-p][c]+" ");
        }
        for(int r=l-2-p;r>=1+p;r--)
        {
            System.out.print(arr[r][0+p]+" ");
        }
        p++;
    }
}
}