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
    void rmdup()
    {
        Node ptr=head;
        while(ptr!=null)
        {
            Node current=ptr;
            while(current.next!=null)
            {
            if(ptr.data==current.next.data)
            {
                current.next=current.next.next;
            }
            else
            current=current.next;
            }
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
		a.rmdup();
		Node ptr=a.head;
		System.out.println("after removal");
		a.print();
	}
}

