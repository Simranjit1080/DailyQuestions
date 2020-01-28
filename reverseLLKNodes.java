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
    void reversek(int k)
    {
         Stack<Node> mystack = new Stack<Node> ();  
    Node current = head;  
    Node prev = null;  
  
    while (current != null) 
    {  
        int count = 0;  
        while (current != null && count < k) 
        {  
            mystack.push(current);  
            current = current.next;  
            count++;  
        }  
        while (mystack.size() > 0)  
        {  
            if (prev == null) 
            {  
                prev = mystack.peek();  
                head = prev;  
                mystack.pop();  
            }  
            else
            {  
                prev.next = mystack.peek();  
                prev = prev.next;  
                mystack.pop();  
            }  
        }  
    }  
    prev.next = null;
    print(head);
    }
    void print(Node h)
    {
        Node ptr=h;
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
		int k=s.nextInt();
		a.reversek(k);
	}
}