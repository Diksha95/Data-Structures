import java.util.*;
class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;
 TreeNode(int x) { val = x; }
}

class BSTIterator {

    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        
        // Stack for the recursion simulation
        this.stack = new Stack<TreeNode>();
        
        // with the root node as the input
        this.leftMostNode(root);
    }

    private void leftMostNode(TreeNode root) {
      
        //add all the elements from left subtree for a given branch.
        while (root != null) {
            this.stack.push(root);
            root = root.left;
        }
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        
        TreeNode topmostNode = this.stack.pop();  //top of the stack will be the current min
        
        if (topmostNode.right != null) {     //Check if current min has right subtree.
            this.leftMostNode(topmostNode.right);
        }

        return topmostNode.val;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return this.stack.size() > 0;
    }
	
	public static void main(String args[]){
		TreeNode n=new TreeNode(7);
		n.left=new TreeNode(3);
		n.right=new TreeNode(15);
		n.right.left=new TreeNode(9);
		n.right.right=new TreeNode(20);
		BSTIterator b = new BSTIterator(n);
		System.out.print(b.next()+" ");
		System.out.print(b.hasNext()+" ");
	}
}