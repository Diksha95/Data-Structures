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
			
		if(root==null)
			return arr;
		if(root.left!=null){
			arr.addAll(InorderTraversal(root.left));
		}
		arr.add(root.val);
		if(root.right!=null){
			arr.addAll(InorderTraversal(root.right));
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
		
		arr1.stream().forEach(obj->System.out.print(obj+" "));
		System.out.println();
		arr2.stream().forEach(obj->System.out.print(obj+" "));
		System.out.println();
		System.out.println(findTwoSum(arr1,arr2,sum));
		//System.out.println(findTwoSum(arr1,arr2,sum));
	}
	
	public static boolean findTwoSum(List<Integer>arr1,List<Integer>arr2,int sum){  //0(m)
	/* 	int arr1[]={0,3 ,4 ,6 ,11 ,17 ,19};
		int arr2[]={1 ,5 ,7 ,8 ,13};
		int x=30;
		 */
		int i=0; int j=arr2.size()-1;
		int bstSum=arr1.get(i)+arr2.get(j);
		while((i>=0 && i<arr1.size()) && (j>=0 && j<arr2.size())){
			
			if(bstSum > sum)
				j--;
			else if(bstSum < sum)
				i++;
			else{
				i++;
				return true;
			}
		}
		return false; 
		
		/* int i=0;
		int j=a.length-1;
	    while(i<j){
	        if(arr1[i]+arr2[j]>x){
	            j--;
	        }
	        else if(arr1[i]+arr2[j]<x){
	            i++;
	        }
	        return true;
	    }
	    
	    return false; */
	}

}