/* https://www.geeksforgeeks.org/delete-n-nodes-after-m-nodes-of-a-linked-list/ */
class SkipMDelN{

	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public static Node skipMDeleteN(Node curr,int M,int N){
	
		curr = head;
		Node prev = null;
		
		while(curr!=null){
			
			for(int i = 0;curr!=null && i<M;i++){
				prev = curr;
				curr = curr.next;
			}
			for(int j = 0;curr!=null && j<N;j++){
				curr = curr.next;
			}
			prev.next = curr;
		}
		return head;
	}
	
	public static void printLinkedList(Node head){

		while(head!=null){
			System.out.print("->"+head.data);
			head = head.next;
		}
	}
	public static void main(String args[]){

        head = new Node (1);
		head.next = new Node (2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);
		System.out.println("List ");
		printLinkedList(skipMDeleteN(head,2,2));
		
    }

}