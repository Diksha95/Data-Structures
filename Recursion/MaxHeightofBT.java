/* Recurrence Relation =>  T(n) =2T(n/2)+1
Complexity of this program is 0(n) 
https://leetcode.com/problems/maximum-depth-of-binary-tree/ LEETCODE Problem -104
*/
public class MaxHeightofBT {

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

    public static int height(Node root){

        if(root == null)
        return 0;

        int left_ht=height(root.left);
        int right_ht=height(root.right);
        int max_ht=Math.max(left_ht, right_ht);
        return 1+max_ht;

    }

    public static void main(String[] args) {
        Node n=new Node(1);
        n.left=new Node(2);
        n.right=new Node(3);
        n.left.left=new Node(4);
        n.left.right=new Node(5);

        System.out.println("The height of binar tree n is : "+ height(n));

    }
}