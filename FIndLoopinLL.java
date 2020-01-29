import java.util.*;
class Main { 
    Node head;
    class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 

    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
  
    void detectLoop() 
    { 
        Node slow_p = head, fast_p = head; 
        while (slow_p != null && fast_p != null && fast_p.next != null) { 
            slow_p = slow_p.next; 
            fast_p = fast_p.next.next; 
            if (slow_p == fast_p) { 
                System.out.println("True"+slow_p.data); 
                return;
            } 
        } 
        System.out.println("False");  
    }
    public static void main(String args[]) 
    { 
        
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int n;
        while(t--!=0)
        {
            Main llist = new Main(); 
            n=s.nextInt();
            for(int i=0;i<n;i++)
            {
                llist.push(s.nextInt());
            }
            Node ptr=llist.head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            Node ptr2=null;
            int k=s.nextInt();
            if(k>0)
            {
                ptr2=llist.head;
            while(k--!=0)
            {
                ptr2=ptr2.next;
            }
            ptr.next=ptr2;
            }
        llist.detectLoop(); 
    } 
}
}
