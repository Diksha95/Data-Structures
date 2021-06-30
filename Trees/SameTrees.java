import java.util.*;
class SameTrees{
	
	static class Node{
		
		int val;
		Node left;
		Node right;
		
		Node(int d){
			
			this.val = d;
			this.left = null;
			this.right = null;
		}
	}
	
	public static boolean sameTrees(Node p,Node q){
			
		//both are null which is a base case	
		if(p==null && q==null) return true;
		
		//one of them is null
		else if(p==null || q==null) return false;
	
		if(p.val == q.val) return sameTrees(p.left,q.left) && sameTrees(p.right,q.right);
		
		return false;
	}
	public static void main(String args[]){
		
		Node p = new Node(1);
		p.left = new Node(2);
		p.right = new Node(3);
		
		Node q = new Node(1);
		q.left = new Node(2);
		q.right = new Node(3);
		
		System.out.println(sameTrees(p,q));
	}
	
}