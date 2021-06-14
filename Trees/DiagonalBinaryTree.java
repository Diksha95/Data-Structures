/* https://www.geeksforgeeks.org/diagonal-traversal-of-binary-tree/amp/
Time Complexity = O(n)
Space Complexity = O(n)
 */
import java.util.*;
class DiagonalBinaryTree{

	static class Node{
		
		char val;
		Node left;
		Node right;
		
		Node(char d){
			
		    this.val = d;
			this.left = null;
			this.right = null;
		}
	}
	
	public static List<Character> getDiagonalView(Node root){
		
		Queue<Node> q = new LinkedList<>();
		List<Character> result = new ArrayList<>();
		Node p = null;
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()){
			p = q.remove();
			if(p==null){
				q.add(null);
				p = q.remove();
				if(p==null) break;
			}
			while(p!=null){
				result.add(p.val);
				if(p.left!=null){
					q.add(p.left);
				}
				p = p.right;
			}
		}
		return result;
	}
	
	public static void main(String args[]){
		
		Node root = new Node('a');
		root.left = new Node('b');
		root.right = new Node('c');
		root.left.left = new Node('d');
		root.left.right = new Node('e');
		root.right.left = new Node('f');
		root.right.right = new Node('g');
		
		List<Character> result = getDiagonalView(root);
		System.out.println(result);
	}
}