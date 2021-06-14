import java.util.*;
class MaxAreaBinaryMatrix{
	
	static class StackNode{
		int price;
		int index;
		
		StackNode(int v,int i){
			this.price=v;
			this.index=i;
		}
	}
	
	public static void main(String args[]){
	
		char binary[][]={{'0','1','1','0'},
						 {'1','1','1','1'},
						 {'1','1','1','1'},
						 {'1','1','0','0'}};
		
		
		System.out.println(getMaxArea(binary));
	}
	
	public static int getMaxArea(char binary[][]){
		
		int[] height = new int[binary[0].length];
		
		//Get single dimensional array for first row of binary matrix
		for(int i = 0; i < binary[0].length; i ++){
			if(binary[0][i] == '1') height[i] = 1;
		}
	
		int max = findMaxArea(findNSL(height),findNSR(height),height);
	
		for(int i = 1; i < binary.length; i++){
			resetHeight(binary,height,i);
			max = Math.max(max,findMaxArea(findNSL(height),findNSR(height),height));
		}
		return max;
	}
	
	public static void resetHeight(char[][] matrix, int[] height, int idx){
		for(int i = 0; i < matrix[0].length; i ++){
			if(matrix[idx][i] == '1') height[i] += 1;
			else height[i] = 0;
		}
	}
	//Function to find nearest smaller to left for i
	public static int[] findNSL(int arr[]){
		
		Stack<StackNode> s=new Stack<>();
		int left[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			
			if(s.size()==0){
				left[i]=-1;
			}else if(s.size() > 0 && s.peek().price < arr[i]){
				left[i]=s.peek().index;
			}else if(s.size() > 0 && s.peek().price >= arr[i]){
				while(s.size() > 0 && s.peek().price >= arr[i]){
					s.pop();
				}
				if(s.size()==0){
					left[i]=-1;
				}else{
					left[i]=s.peek().index;
				}
			}
			StackNode node=new StackNode(arr[i],i);
			s.push(node);
		}
		return left;
		
	}
	
	//Function to find nearest smaller to right for i
	public static int[] findNSR(int arr[]){
		
		Stack<StackNode> s=new Stack<>();
		int right[]=new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--){
			
			if(s.size()==0){
				right[i]=arr.length;
			}else if(s.size() > 0 && s.peek().price < arr[i]){
				right[i]=s.peek().index;
			}else if(s.size() > 0 && s.peek().price >= arr[i]){
				while(s.size() > 0 && s.peek().price >= arr[i]){
					s.pop();
				}
				if(s.size()==0){
					right[i]=arr.length;
				}else{
					right[i]=s.peek().index;
				}
			}
			StackNode node=new StackNode(arr[i],i);
			s.push(node);
		}
		//right=reverseArray(right);
		return right;
	}
	
	public static int findMaxArea(int left[],int right[],int arr[]){
		
		int width[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			
			width[i]=right[i]-left[i]-1;
		}
		int maxArea=0;
		int area[]=new int[arr.length];
		for(int j=0;j<arr.length;j++){
			
			area[j]=arr[j]*width[j];
			if(area[j]>maxArea){
				maxArea=area[j];
			}
		}
		
		return maxArea;
	}
	
}