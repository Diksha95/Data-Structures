/* https://www.geeksforgeeks.org/write-a-function-that-counts-the-number-of-times-a-given-int-occurs-in-a-linked-list/
	Complexity O(n)
*/
class FindKey{
	
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data=d;
			this.next=null;
		}
	}
	
	public static int countTimes(int key,Node n){
		int count = 0;
		while(n!=null){
			
			if(n.data == key){
				count++;
			}
			n = n.next;
		}
		return count;
	}
	public static void main(String args[]){
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(1);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(1);
		head.next.next.next.next.next.next = new Node(1); 
		
		System.out.println(countTimes(1,head));
	
	}
}