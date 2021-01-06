public class MaxPathSumofBT {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }  

    static int result=Integer.MIN_VALUE;
	
    public static int maxPathSum(Node root) {
          
          if(root==null)
              return 0;
          
          findMaxPathSum(root);
          return result;
      }
    
    public static int findMaxPathSum(Node root){
       if(root==null)
       return 0;
 
       int l=findMaxPathSum(root.left);
       int r=findMaxPathSum(root.right);
	   int rootVal=root.data;
       int temp=Math.max(Math.max(l,r)+rootVal,rootVal);
       int ans=Math.max(rootVal+l+r,temp);

       result=Math.max(result,Math.max(temp, ans));
        return temp;
    }

    public static void main(String[] args) {
        Node n=new Node(-10);
        n.left=new Node(9);
        n.right=new Node(20);
        n.right.left=new Node(15);
        n.right.right=new Node(7);

        System.out.println("The Max path sum of binary tree n is : "+ maxPathSum(n));

    }
}