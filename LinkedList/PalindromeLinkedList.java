import java.util.*;
class PalindromeLinkedList{

	static Node head;
	static class Node {
	
		char val;
		Node next;
		
		Node (char data){
			this.val= data;
			this.next = null;
		}
	}
	
	public static boolean isPalindrome(Node head){
	
		Node p1 = head;
		Node p2 = reverse(getRightHalf(head));
		
		while(p2 != null){
			
			if( p1.val != p2.val) return false;
			p1 = p1.next;
			p2 = p2.next;
		}
		return true;
	}
	
	public static Node getRightHalf(Node head){
		
		if(head == null || head.next == null)
			return head;
		
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow.next;
	}
	
	public static Node reverse(Node head){
		
		if(head == null || head.next ==null){
			return head;
		}
		
		Node p = head;
		Node prev = null;	
		while( p!=null){
			
			p.next = prev;
			prev = p;
			p = p.next;
		}
		return prev;
	}
	
	public void push(char new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
	
	public static void main(String args[]){

        PalindromeLinkedList llist = new PalindromeLinkedList();
 
        char str[] = { 'a', 'b', 'a', 'c', 'a', 'b', 'b' };
		
        String string = new String(str);
		
        for (int i = 0; i < 7; i++) {
            llist.push(str[i]);
        }
		if (isPalindrome(head)!= false) {
               System.out.println("Is Palindrome");
            }
        else{
              System.out.println("Not Palindrome");
        }
	}
	
}