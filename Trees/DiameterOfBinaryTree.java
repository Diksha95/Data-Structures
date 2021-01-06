public class DiameterOfBinaryTree {

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
    public static int height(Node x){
        if(x==null) 
        return 0;
        int left_ht=height(x.left);
        int right_ht=height(x.right);
        int max_ht=Math.max(left_ht,right_ht);
        return 1+max_ht;
        
    }
    public static int diameter(Node root){

        if(root==null)
        return 0;

        // When root is the part of the diameter
        int l=height(root.left);
        int r=height(root.right);
        int total_ht=1+l+r;

       System.out.println("Total Height "+total_ht);
        //When root is not the part of diameter
        int l_ht=diameter(root.left);
        int r_ht=diameter(root.right);
        int max_dia=Math.max(l_ht, r_ht);
        
        System.out.println("Max Diameter "+max_dia);
        int res=Math.max(total_ht, max_dia);

        return res;
    }
    public static void main(String[] args) {
      
        Node n=new Node(1);
        n.left=new Node(2);
        n.right=new Node(3);
        n.left.left=new Node(4);
        n.left.right=new Node(5);

        System.out.println("The diameter of binar tree n is : "+ diameter(n));

    }
}