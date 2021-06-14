import java.util.*;
class ZigZagTraversal{
	
	static class Node{
		
		int val;
		Node left;
		Node right;
		
		Node(int d){
			this.val = d;
			Node left = null;
			Node right = null;
		}
	}
	public static List<List<Integer>> zigzagLevelOrder(Node root){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		getTraversal(result,root,0);
		return result;
	}
	
	public static void getTraversal(List<List<Integer>> result,Node root,int level){
		
		if(root == null)
			return;
		
		if(result.size() <= level){
			result.add(new ArrayList<Integer>());
		}
		//Here we are checking whether the level is even if it is odd then we need the values in reverse order
		if(level%2 == 0){
			result.get(level).add(root.val);
		}else{
			//inserting always at the starting of the list to reverse elements
			result.get(level).add(0,root.val);
		}
		getTraversal(result,root.left,level+1);
		getTraversal(result,root.right,level+1);
	} 
	public static void main(String args[]){
		
		Node n=new Node(1);
        n.left=new Node(2);
        n.right=new Node(3);
        n.right.left=new Node(4);
        n.right.right=new Node(5);
		
		System.out.println(zigzagLevelOrder(n));
	}
}