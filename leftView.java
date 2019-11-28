public class Main 
{ 
    static class Node  
    { 
    int data; 
    Node left, right;
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
    } 
    static Node root;
    static int j=0;
    static void leftview(Node n,int k)  
    { 
        if(n==null)
        return;
        if(j<k)
        {
        System.out.print(n.data+" ");
        j=k;
        }
        leftview(n.left,k+1);
        leftview(n.right,k+1);
        return;
    } 
    public static void main(String args[])  
    { 
        root = new Node(20); 
        root.left = new Node(10); 
        root.right = new Node(30); 
        root.left.left = new Node(5); 
        root.left.right = new Node(15); 
        root.right.left = new Node(25); 
        root.right.right = new Node(45); 
        root.left.right.left = new Node(11); 
        root.left.right.right = new Node(18); 
        leftview(root,1);
   
    } 
}