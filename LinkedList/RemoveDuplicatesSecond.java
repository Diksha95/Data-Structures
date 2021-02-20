import java.util.*;
class RemoveDuplicatesSecond{
	
	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public static Node deleteDuplicates(Node head) {
        //If list has only one node or list is null
        if(head == null || head.next ==null){
            return head;
        }
        //This checks for the next distinct element if it is present 
        //it will call the deleteDuplicates function on the remaining list 
        if(head.data!=head.next.data){
            head.next = deleteDuplicates(head.next);
            return head;
        }
        //Here temp node checks for non repeating element.
        Node temp = head;
        while(temp!= null && temp.data == head.data){
            temp = temp.next;
        }
        return deleteDuplicates(temp);
    }
	
	public static void printLinkedList(Node head){

		while(head!=null){
			System.out.print("->"+head.data);
			head = head.next;
		}
	}
	
	public static void main(String args[]){

        head = new Node (12);
		head.next = new Node (12);
		head.next.next = new Node(12);
		head.next.next.next = new Node(21);
		head.next.next.next.next = new Node(41);
		head.next.next.next.next.next = new Node(43);
		head.next.next.next.next.next.next = new Node(43);
		head.next.next.next.next.next.next.next = new Node(60);
		System.out.println("List before reversal");
		printLinkedList(head);
		System.out.println();
		System.out.println("List after reversal");
		System.out.println();
		printLinkedList(deleteDuplicates(head));
		
    }
	
	
}