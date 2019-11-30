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
    void palindromeLL(int k)
    {
        int arr[]=new int[k];
        Node ptr=head;
        int i=0;
        while(ptr!=null)
        {
            arr[i]=ptr.data;
            i++;
            ptr=ptr.next;
        }
        i=0;
        int j=k-1;
        int c=0;
        while(i<j)
        {
            if(arr[i]==arr[j])
            {
                i++;
                j--;
            }
            else
            {
              c=1;
              break;
            }
        }
        if(c==0)
        System.out.println("Linked list is a palindrome");
        else
        System.out.println("Linked list is not a palindrome");
    }
    public static void main(String[] args) {
        Main a= new Main();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
	    int temp=size;
		while(size--!=0)
		{
		   a.insert(s.nextInt());
		}
		a.palindromeLL(temp);
	}
}