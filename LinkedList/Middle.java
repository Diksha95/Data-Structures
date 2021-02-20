/* https://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/ 
   Complexity - O (n)
*/
class Middle{

	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data=d;
			this.next=null;
		}
	}
	
	public static int getCount(Node n){
		int count=1;
		while(n!=null){
			count++;
			n=n.next;
		}
		return count;
	}
	//This approach not work for all cases
	public static int findNode(Node n,int mid){
		
		int length=getCount(n);
		while(n.next!=null){
			if(length == mid){
				return n.data;
			}
			n = n.next;
			length --;
		}
		return 0;
	
	}
	
	//Two pointer approach in single traversal
	public static int getMiddle(Node n){
		Node start = n;
		Node end = n;
		if(n != null){
			
			while(start.next!=null){
				start = start.next.next;
				end = end.next;
			}
		}
		
		return end.data;
	}
	
	public static void main(String args[]){
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7); 
		
		System.out.println(getMiddle(head));
	
	}
}