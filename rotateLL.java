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
    void print()
    {
        Node ptr=head;
    while(ptr!=null)
		{
		    System.out.print(ptr.data+" ");
		    ptr=ptr.next;
		}
    }
    void rotate(int k)
    {
        Node ptr=head;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=head;
        ptr=head;
        Node prev=head;
        while(k--!=0)
        {
            prev=ptr;
            ptr=ptr.next;
        }
        head=ptr;
        prev.next=null;
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
		System.out.println("Enter the rotation required");
		int k=s.nextInt();
		if(k!=0&&k!=size)
		a.rotate(k);
		System.out.println("after rotation");
		a.print();
	}
}