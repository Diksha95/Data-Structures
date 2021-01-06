/* https://leetcode.com/problems/binary-tree-inorder-traversal/ */
import java.util.*;
class InorderTraversalofBT{

	static class Node{
		int val;
		Node left;
		Node right;
		
		Node(int v){
		this.val=v;
		this.left=null;
		this.right=null;
		}
	}
	
	public static List<Integer> InorderTraversal(Node n){
		ArrayList<Integer> arr=new ArrayList<>();
		
		if(n==null)
			return arr;
		if(n.left!=null){
			arr.addAll(InorderTraversal(n.left));
		}
		arr.add(n.val);
		if(n.right!=null){
			arr.addAll(InorderTraversal(n.right));
		}
		return arr;
	}
	
	public static void main(String args[]){
		
		Node n=new Node(6);
		n.left=new Node(3);
		n.right=new Node(17);
		n.left.left=new Node(0);
		n.left.right=new Node(4);
		n.right.left=new Node(11);
		n.right.right=new Node(19);
		
		System.out.println("Inorder Traversal");
		InorderTraversal(n).forEach(obj->System.out.print(obj+" "));
	}

}