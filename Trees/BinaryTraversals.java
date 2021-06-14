import java.util.*;
class BinaryTraversals{
	
	static class Node{
		Node left;
		Node right;
		int data;
		
		public Node(int d){
			this.left = null;
			this.right = null;
			this.data = d;
		}
	}
	
	public static void preOrderTraversal(Node root){
		
			if(root!=null){
				System.out.print(root.data+" ");
				preOrderTraversal(root.left);
				preOrderTraversal(root.right);
				
			}
	}
	
	public static void inOrderTraversal(Node root){
			
			if(root!=null){
				inOrderTraversal(root.left);
				System.out.print(root.data+" ");
				inOrderTraversal(root.right);
			}
		
	}

	public static void postOrderTraversal(Node root){
		
			if(root!=null){
				postOrderTraversal(root.left);
				postOrderTraversal(root.right);
				System.out.print(root.data+" ");
			}
		
	}
	
	public static List<Integer> preOrderTraversalIterative(Node root){
		List<Integer> list = new ArrayList<>();
		if(root == null)
			return list;
			
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while(stack.size() > 0){
			Node temp = stack.pop();
			list.add(temp.data);
			
			if(temp.right!=null) stack.push(temp.right);
			if(temp.left!=null) stack.push(temp.left);
		}
			return list;
	}
	
	public static List<Integer> inOrderTraversalIterative(Node root){
		List<Integer> list = new ArrayList<>();
		if(root == null)
			return list;
			
		Stack<Node> stack = new Stack<Node>();
		while(true){
			if(root!=null){
				stack.push(root);
				root = root.left;
			}else{
				if(stack.empty()) break;
				root = stack.pop();
				list.add(root.data);
				root = root.right;
			}
		}
			return list;
	}
	
	public static List<Integer> postOrderTraversalIterative(Node root){
		List<Integer> list = new ArrayList<>();
		if(root == null)
			return list;
			
		Stack<Node> stack = new Stack<Node>();
		while(true){
		stack.push(root);
			if(root!=null){
				
				root = root.left;
			}else{
				if(stack.empty()) break;
				root = stack.pop();
				list.add(root.data);
				root = root.right;
			}
		}
			return list;
	}
		

	public static void main(String args[]){
		
		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(3);
		n.left.left = new Node(4);
		n.left.right = new Node(5);
		n.right.left = new Node(6);
		n.right.right = new Node(7);
		
		preOrderTraversalIterative(n).forEach(obj->System.out.print(obj+" "));
		System.out.println("Pre order traversal");
		inOrderTraversalIterative(n).forEach(obj->System.out.print(obj+" "));
		/* System.out.println("Pre order traversal ");
		preOrderTraversal(n);
		System.out.println();
		System.out.println("In order traversal ");
		inOrderTraversal(n);
		System.out.println();
		System.out.println("Post order traversal ");
		postOrderTraversal(n); */
		
	}
}