import java.util.*;
import java.lang.*;
public class Main
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    Node head;
    void insert(int data)
    {
       Node n=new Node(data);
       if(head==null)
       {
           head=n;
           return;
       }
       Node ptr=head;
       while(ptr.next!=null)
       {
           ptr=ptr.next;
       }
       ptr.next=n;
       return;
    }
    public static Main sum(Main a,Main b)
    {
        Node ptr1=a.head;
        Node ptr2=b.head;
        int num1=0;
        int num2=0;
        int k=0;
        while(ptr1!=null)
        {
            num1=num1+ptr1.data*(int)Math.pow(10,k);
            ptr1=ptr1.next;
            k++;
        }
        k=0;
        while(ptr2!=null)
        {
            num2=num2+ptr2.data*(int)Math.pow(10,k);
            ptr2=ptr2.next;
            k++;
        }
        int num3=num1+num2;
        Main temp=new Main();
        int rem=0;
        while(num3!=0)
        {
            rem=num3%10;
            temp.insert(rem);
            num3=num3/10;
        }
        return temp;
    }
    void print()
    {
        Node ptr=head;
    while(ptr!=null)
		{
		    System.out.print(ptr.data+" ");
		    ptr=ptr.next;
		}
    }
    public static void main(String[] args) {
        Main a= new Main();
        Main b=new Main();
        Main c=new Main();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of first list");
		int size=s.nextInt();
		System.out.println("Enter elements");
		while(size--!=0)
		{
		   a.insert(s.nextInt());
		}
		System.out.println("Enter the size of second list");
		size=s.nextInt();
		System.out.println("Enter elements");
		while(size--!=0)
		{
		   b.insert(s.nextInt());
		}
		System.out.print("Sum=");
		c=sum(a,b);
		c.print();
	}
}
