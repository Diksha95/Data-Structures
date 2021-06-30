class MinMaxArray{
	
	static class MinMax{
		
		int min;
		int max;
	}
	
	public static MinMax getMinMax(int arr[],int low,int high){
		
		int n = arr.length - 1;
		MinMax minMax = new MinMax();
		MinMax minMaxLeft = new MinMax();
		MinMax minMaxRight = new MinMax();
			
		if(low == high){
			minMax.min = arr[low];
			minMax.max = arr[high];
			return minMax;
		}
		if(low +1 == high){
			if(arr[low]>arr[high]){
			
				minMax.min = arr[low];
				minMax.max = arr[high];
			}else{
			
				minMax.min = arr[low];
				minMax.max = arr[high];
			}
			return minMax;
		}
		
		int mid = (high + low)/ 2;
		
		minMaxLeft = getMinMax(arr,low,mid);
		minMaxRight = getMinMax(arr,mid+1,high);
		
		if(minMaxLeft.min < minMaxRight.min){
			minMax.min = minMaxLeft.min;
		}else{
			minMax.min = minMaxRight.min;	
		}
		
		if(minMaxLeft.max < minMaxRight.max){
			minMax.max = minMaxRight.max;
		}else{
			minMax.max = minMaxLeft.max;
		}
		return minMax;
	}
	
	public static void main(String args[]){
		int arr[] = {1000, 11, 445, 1, 330, 3000};
		MinMax pair = getMinMax(arr,0,arr.length-1);
		 System.out.println("Max value is : "+ pair.max+ " and Min value is : "+pair.min);
	}
}