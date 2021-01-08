/*
Complexity will O(n) 
*/
import java.util.*;
class NextGreaterElementLeft{
	
	public static void main(String args[]){
		
		int arr[]={1,3,2,4};
		
		ArrayList<Integer> arrList=getNGE(arr);
		//Collections.reverse(arrList);
		for(int i:arrList){
			System.out.print(i+" ");
		}
	}
	
	public static ArrayList<Integer> getNGE(int arr[]){
		
		ArrayList<Integer> arrList=new ArrayList<>();
		
		Stack<Integer> s=new Stack<Integer>();
		
		for(int i=0;i<arr.length;i++){
			
			if(s.size()==0){
				arrList.add(-1);
			}
			
			else if(s.size() > 0 && s.peek()> arr[i]){  //Current element in the stack is greater then the array element
				arrList.add(s.peek());
			}
			else if(s.size() >0 && s.peek()<=arr[i]){  
			// If top element is less then we will pop the elements of the stack till we get the greater element than current
				
				while(s.size()>0 && s.peek()<=arr[i] ){
					
					s.pop();
				}
				if(s.size()==0)
				{
					arrList.add(-1);
				}
				else
					arrList.add(s.peek());
			}
			s.push(arr[i]);  //adding the current element in stack for next iterations
		}
		return arrList;
	}
}