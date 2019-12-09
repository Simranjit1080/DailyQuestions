import java.util.*;
public class Main
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
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
    void insertmid(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        n.next=slow.next;
        slow.next=n;
        
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
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		while(size--!=0)
		{
		   a.insert(s.nextInt());
		}
		System.out.println("Enter the element to add in the mid");
		int k=s.nextInt();
		a.insertmid(k);
		System.out.println("after adding in middle");
		a.print();
	}
}


