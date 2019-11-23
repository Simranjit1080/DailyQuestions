import java.util.*;
public class Main
{
    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data=data;
            prev=next=null;
        }
    }
    static Node head;
    static void insert(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        else
        {
            Node ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            n.prev=ptr;
            ptr.next=n;
        }
    }
    static void reverse()
    {
        if(head==null ||head.next==null)
        return;
        Node t=null;
        Node curr=head;
        while(curr!=null)
        {
            t=curr.prev;
            curr.prev=curr.next;
            curr.next=t;
            curr=curr.prev;
        }
        head=t.prev;
    }
	public static void main(String[] args) {
		System.out.println("Enter the size");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    insert(s.nextInt());
		}
		reverse();
		Node ptr=head;
		System.out.println("After reverse");
		while(ptr!=null)
		{
		  System.out.println(ptr.data);
		  ptr=ptr.next;
		}
	}
}