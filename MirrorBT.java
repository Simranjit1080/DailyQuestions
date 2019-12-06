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
	boolean checkMirror(Node a,Node b)
	{
		if(a==null&&b==null)
			return true;
		if(a!=null&&b!=null&&a.data==b.data)
		{
			return (checkMirror(a.left,b.right))&&(checkMirror(a.right,b.left));
		}
		return false;
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
		System.out.println(bt.checkMirror(bt.root,bt.root));
	}

}