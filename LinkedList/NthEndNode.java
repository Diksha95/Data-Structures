/* https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1 */
class NthEndNode{
	
	static Node head;
	static class Node{
		char data;
		Node next;
		
		public Node(char d){
			this.data=d;
			this.next=null;
		}
	}
	public static int getCount(Node n){
		int count=0;
		n=head;
		while(n!=null){
			count++;
			n=n.next;
		}
		return count;
	}
	//Single traversal approach
	public static char getNode(Node head,int n){
		Node start = head;
		Node end = head;
		if(start==null)
			return '\0';
		int i = 0;
		//This counter helps to reach the n-1 location,n-1 location means node previous to the reqd node
		while(i < n-1){
			start = start.next;
			i++;
		}
		//Here start is at n-1 and end is at head position by the time start reaches last end have reached desired position
		while(start.next!=null){
			end = end.next;
			start = start.next;
		}
		return end.data;
		
	}
	public static void main(String args[]){
	
		head = new Node('A');
		head.next = new Node('B');
		head.next.next = new Node('C');
		head.next.next.next = new Node('D');
		System.out.println(getNode(head,3));
	}
}