/* Leetcode : 739 https://leetcode.com/problems/daily-temperatures/ */
import java.util.*;
class DailyTemp{

	static class Temp{
		int temp ;
		int index;
		
		Temp(int t,int i){
			this.temp = t;
			this.index = i;
		}
	}
	
	public static void main(String args[]){
		int T[] ={73, 74, 75, 71, 69, 72, 76, 73};
		
		int output [] = getWarmerTemp(T);
		System.out.print("[");
		for(int i = 0;i<output.length;i++){
			System.out.print(output[i]+",");
		}
		System.out.print("]");
	}
	
	public static int[] getWarmerTemp(int arr[]){
		Stack<Temp> stack = new Stack<>();
		int output[] = new int[arr.length];
		for(int i = arr.length-1;i>=0;i--){
			
			if(stack.size()==0){
				output[i] = 0;
			}else if (stack.size()>0 && stack.peek().temp > arr[i]){
				output[i] = stack.peek().index;
			}else{
				while(stack.size() > 0 && stack.peek().temp <= arr[i]){
					stack.pop();
				}
				if(stack.size()==0){
					output[i] = 0;
				}else{
					output[i] = stack.peek().index;
				}
			}
			Temp t = new Temp(arr[i],i);
			stack.push(t);
		}
		//For final array we need to subtract the index of current element from index of NGR 
		for(int i =0;i<output.length;i++){
			if(output[i]==0){
				output[i]=0;
			}else{
				output[i] = output[i] - i;
			}	
		}
		return output;
	}
}