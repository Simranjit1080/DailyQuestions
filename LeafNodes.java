public class Main 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
		}
	}
	static Node root;
	void LeafNodes(Node root) 
    { 
        if (root==null) 
            return; 
        if (root.left==null && root.right==null) 
        { 
            System.out.println(root.data+" ");  
            return; 
        } 
        if (root.left!=null) 
           LeafNodes(root.left); 
        if (root.right!=null) 
            LeafNodes(root.right); 
    }
	public static void main(String args[])
	{
		Main bt=new Main();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(2);
		bt.root.left.left=new Node(3);
		bt.root.left.right=new Node(4);
		bt.root.right.left=new Node(4);
		bt.root.right.right=new Node(3);
	    bt.LeafNodes(bt.root);
	}

}