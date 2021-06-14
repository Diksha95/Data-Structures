/* Leetcode : 155  https://leetcode.com/problems/min-stack/
Min Stack using O(1) Space */
class MinStackLeet{

	public static void push(int x){
		if(head == null){
			head = new Node(x,x,null);
		}else{
			//Giving head here because we are maintaining the stack in LIFO order
			//Each item should be inserted at the top of the stack
			head = new Node(x,Math.min(x,head.min),head);
		}
	}
	
	public static void pop(){
		head = head.next;
	}
	
	public static int getMin(){
		return head.min;
	}
	
	public static int top(){
		return head.val;
	}
	
	static Node head;
	static class Node{
		
		int val;
		int min;
		Node next;
		
		Node(int v,int m,Node n){
			this.val = v;
			this.min = m;
			this.next = n;
		}
	}
	
	public static void main(String args[]){
		
		System.out.println("Get Min element after inserting 18,19,29");
		push(18);
		push(19);
		push(29);
		System.out.println(getMin());
		System.out.println("Get Min element after inserting 15");
		push(15);
		System.out.println(getMin());
		pop();
		System.out.println("Get Min element after popping 15");
		System.out.println(getMin());
		System.out.println("Get Min element after inserting 16");
		push(16);
		System.out.println(getMin());
	}
}