class BinaryTree
{
	Node root;
	static class Node
	{
		int data;
		Node left,right;

	Node(int x)
	{
		data=x;
		left=null;
		right=null;
	}
	}

	BinaryTree()
	{
		root=null;
	}

static void printInorder(Node n)
{
	if(n==null)
		return;
	printInorder(n.left);
	System.out.print(n.data+"\t");
	printInorder(n.right);
}

static void printPostorder(Node n)
{
	if(n==null)
		return;
	printPostorder(n.left);
	printPostorder(n.right);
	System.out.print(n.data+"\t");
}
static void printPreorder(Node n)
{
	if(n==null)
		return;
	System.out.print(n.data+"\t");
	printPostorder(n.left);
	printPostorder(n.right);
}

public static void main(String[] args) {
	
	BinaryTree bt=new BinaryTree();
	bt.root=new Node(1);
	bt.root.left=new Node(2);
	bt.root.right=new Node(3);
	bt.root.left.left=new Node(4);
	bt.root.left.right=new Node(5);

	System.out.println("Inorder traversal of BinaryTree is");
	printInorder(bt.root);
	System.out.println("\nPostOrder traversal of BinaryTree is");
	printPostorder(bt.root);
	System.out.println("\nPreOrder traversal of BinaryTree is");
	printPreorder(bt.root);
}

}