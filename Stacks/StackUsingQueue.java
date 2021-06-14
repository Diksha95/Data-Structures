import java.util.*;
class StackUsingQueue {

    /** Initialize your data structure here. */
    Queue<Integer> q1;
    public StackUsingQueue() {
        q1 = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
           q1.add(x);
        
        int n = q1.size(); 
        while(n-- > 1){
            q1.add(q1.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        
        return q1.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return q1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.size() ==0;
    }
	
	public static void main(String args[]){
		StackUsingQueue stack = new StackUsingQueue();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		int ele = stack.pop();
		boolean find = stack.empty();
		System.out.println(ele);
		System.out.println(find);
		
		
	}
}