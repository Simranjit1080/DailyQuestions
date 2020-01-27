import java.util.*;
public class Main
{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        public Node()
        {
            
        }
    Node root=null;
    public void insert(int data)
    {
        Node temp=new Node(data);
        if(root==null)
        {
            root=temp;
            return;
        }
        Node ptr=root;
        while(ptr.next!=null)
        ptr=ptr.next;
        temp.next=ptr.next;
        temp.prev=ptr;
        ptr.next=temp;
        
    }
    public void sumeq(int x)
    {
        Node first=root;
        Node sec=root;
        while(sec.next!=null)
        {
            sec=sec.next;
        }
        int flag=0;
        while(first!=null && sec!=null && first!=sec && sec.next!=first)
        {
            if(first.data+sec.data==x)
                {
                    flag=1;
                    System.out.print("("+sec.data+", "+first.data+") ");
                    first=first.next;
                    sec=sec.prev;
                }
            else
                {
                    if(first.data+sec.data<x)
                        first=first.next;
                    else
                        sec=sec.prev;
                }
        }
        if(flag==0)
        System.out.println("No such pairs");
    }
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node obj=new Node();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    obj.insert(s.nextInt());
		}
		int x=s.nextInt();
		obj.sumeq(x);
		
	}
}