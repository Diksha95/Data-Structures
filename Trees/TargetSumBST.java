/* https://practice.geeksforgeeks.org/problems/find-a-pair-with-given-target-in-bst/1# 
Time Complexity: O(n).
Inorder Traversal of BST takes linear time.
Auxiliary Space: O(n).
Use of array for storing the Inorder Traversal.
*/
import java.io.*;
import java.util.*;
import java.math.*;

class TargetSumBST{
	static class Node{ 
    int data; 
    Node left, right; 
   
    public Node(int d){ 
        data = d; 
        left = right = null; 
    } 
	}
	
	public static void main(String args[]){
		
		Node n=new Node(15);
		n.left=new Node(10);
		n.right=new Node(20);
		n.left.left=new Node(8);
		n.left.right=new Node(12);
		n.right.left=new Node(16);
		n.right.right=new Node(25);
		
		System.out.println("The no of pairs present are "+isPairPresent(n,33));
		
	}
    // root : the root Node of the given BST
    // target : the target sum
    public static int isPairPresent(Node root, int target)
    {
        // Write your code here
        int count=0;
        List<Integer> list=InorderTraversal(root);
        if(twoSum(0,list.size()-1,target,list))
            count++;
        
        return count;
    }
    
    public static boolean twoSum(int i,int j,int target,List<Integer>arr){
        
       	while(i<j){
			
			if(arr.get(i) + arr.get(j) > target)
				j--;
			else if(arr.get(i) + arr.get(j) < target)
				i++;
			else
				return true;
		}
		return false; 
    }
    public static List<Integer>InorderTraversal(Node root){
        List<Integer> list=new ArrayList<Integer>();
        
        if(root==null)
        
        return list;
        
        if(root.left!=null)
            list.addAll(InorderTraversal(root.left));
        
        list.add(root.data);
        
        if(root.right!=null)
            list.addAll(InorderTraversal(root.right));
        
        return list;
    }
}
