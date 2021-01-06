/* https://leetcode.com/problems/binary-tree-inorder-traversal/ 
Time Complexity = O(m+n)
*/
import java.util.*;
class TwoBSTSums{

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
	
	public static List<Integer> InorderTraversal(Node root){   //0(n)
		List<Integer> arr=new ArrayList<>();
		
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
		
		Node n1=new Node(8);
		n1.left=new Node(5);
		n1.right=new Node(13);
		n1.left.left=new Node(1);
		n1.left.right=new Node(7);
		
		int sum=30;
		List<Integer> arr1=InorderTraversal(n);
		List<Integer> arr2=InorderTraversal(n1);
		
		System.out.println("The two BSTs contains values that gives target sum is "+findTwoSum(arr1,arr2,sum));
	}
	
	public static boolean findTwoSum(int arr1[],int arr2[],int sum){  //0(m)
		
		int i=0; int j=arr2.length-1;
		
		while(i<j){
			
			if(arr1[i]+arr2[j]<sum)
				i++;
			else if(arr1[i]+arr2[j]>sum)
				j--;
			else
				return true;
		}
		return false;
	}

}