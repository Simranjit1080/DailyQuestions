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
    static Node ancestor(Node n, int a, int b)  
    { 
        if (n==null) 
        {
            return null;
        }
        if (n.data==a || n.data==b)
        {
            return n; 
        }
        Node l=ancestor(n.left,a,b);
        Node r=ancestor(n.right,a,b);
        if(l!=null&&r!=null)
        return n;
        if(l!=null)
        return l;
        if(r!=null)
        return r;
        return n;
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
   
        int a=15;
        int b=25; 
        Node k=ancestor(root,a,b); 
        System.out.println("LCA("+a+","+b+")="+k.data); 
   
    } 
}