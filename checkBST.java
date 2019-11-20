import java.util.*;
public class Main 
{
	static class Node
	{
		Node left,right;
		int data;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	static Node root;
    static boolean checkBST()
    {
        Node ptrl=root;
        Node ptrr=root;
        while(ptrl.left!=null)
        {
            if(ptrl.left.data>ptrl.data)
            {
                return false;
            }
            if(ptrl.right!=null)
            {
                 if(ptrl.right.data<ptrl.data)
                 return false;
            }
            ptrl=ptrl.left;
        }
        while(ptrr.right!=null)
        {
            if(ptrr.right.data<ptrr.data)
            {
                return false;
            }
            if(ptrr.left!=null)
            {
                 if(ptrr.left.data>ptrr.data)
                 return false;
            }
            ptrr=ptrr.right;
        }
        return true;
    }
	public static void main(String args[])
	{
		root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(20);
		root.left.left=new Node(2);
		root.left.right=new Node(6);
		root.right.right=new Node(70);
		root.right.left=new Node(15);
		if(checkBST())
		{
		   System.out.println("Is BST");
		}
		else
		System.out.println("Not BST");
	}
}