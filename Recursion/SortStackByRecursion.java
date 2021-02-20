import java.util.*;
class SortStackByRecursion{

	public static void main(String args[]){
		
	Stack<Integer> s=new Stack<Integer>();
        s.push(2);
        s.push(7);
        s.push(6);
        s.push(4);
        s.push(5);
		s.push(9);
	s=sort(s);
	s.stream().forEach(System.out::println);
	}
	
	public static Stack<Integer> sort(Stack<Integer> stack){
		
		if(stack.size()==1)
		return stack;
		
		Integer temp=stack.pop();
		stack=sort(stack);
		return insert(stack,temp);
	}
	
	public static Stack<Integer> insert(Stack<Integer> stack,int temp){
		
		if(stack.size()==0 || stack.peek()<=temp){
			stack.push(temp);
			return stack;
		}
		Integer val=stack.pop();
		stack=insert(stack,temp);
		stack.push(val);
		return stack;
	}
}