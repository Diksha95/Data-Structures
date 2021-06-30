/* Leetcode : 73 
	https://leetcode.com/problems/set-matrix-zeroes/ 
	*/
class SetMatrixZeroes{
	
	public static void main(String args[]){
	
		int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
		int m = matrix.length;
		int n = matrix[0].length;
		//bruteForceSolution(matrix);
		//betterApproach(matrix);
		bestApproach(matrix);
		for(int i = 0;i<m;i++){
			
			for(int j = 0;j<n;j++){
				
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/*Time Complexity will O(M*N(M+N))
	M*N traversing the rows and columns and M+N filling aux array
	Space Complexity O(M*N)
	*/
	public static void bruteForceSolution(int matrix[][]){
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		int aux[][] = new int [m][n];
		
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				aux[i][j] = 1;
			}
		}
		// if found 0 in main array making row and column in the auxilary row and column as 0
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				if(matrix[i][j] == 0){
					
					for(int k = 0;k<m;k++){
						aux[k][j] = 0;
					}
					for(int k = 0;k<n;k++){
						aux[i][k] = 0;
					}
				}
			}
		}
		//copying elements back to main array
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				matrix[i][j] = aux[i][j];
			}
		}
	}
	
	/* Time Complexity O(m+n) - for filling the aux arrays and 2*O(M*N) = O(M*N)
	   Space Complexity O(M*N)
	*/
	public static void betterApproach(int matrix[][]){
		
		int m = matrix.length;
		int n = matrix[0].length;
		boolean auxR[] = new boolean[m];
		boolean auxC[] = new boolean[n];
		
		for(int i = 0;i<m;i++){
			auxR[i] = false;
		}
		
		for(int j = 0;j<n;j++){
			auxC[j] = false;
		}
		
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				if(matrix[i][j] == 0){
					auxR[i] = true;
					auxC[j] = true;
				}
			}
		}
		
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				if(auxR[i] == true || auxC[j] == true){
					matrix[i][j] = 0;
				}
			}
		}
	}
	/* Time Complexity: Checking the first row and first column + Traversing and updating the matrix + Updating first row and first column.
	= O(M) + O(N) + O(M*N) + O(M) + O(N) = O(M*N)
	Space Complexity: O(1) */
	public static void bestApproach(int matrix[][]){
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		//Taking two variables for storing status of first row and column
		boolean firstRow = false;
		boolean firstColumn = false;
		
		//any element except for first row and first column is zero
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				if(matrix[i][j] == 0){
					if(i == 0) firstRow == true;
					if(j == 0) firstColumn == true;
					//Making first row and first column as zero
					matrix[i][0] = 0;
					matrix[0][j] = 0;
					
				}
			}
		}
		
		//any element except for first row and first column is zero
		for(int i = 1;i<m;i++){
			
			for(int j = 1;j<n;j++){
				//based on first row and first column making the entire column and row as zero
				if(matrix[0][j] == 0 || matrix[i][0] == 0){
					//Making first row and first column as zero
					matrix[i][j] = 0;
				}
			}
		}
		//Making every column value to 0 in first row
		if(firstRow){
			
			for(int j = 0;j <n;j++){
				matrix[0][j] = 0;
			}
		}
		//Making every row value to 0 in first column
		if(firstColumn){
			
			for(int i = 0;i <m;i++){
				matrix[i][0] = 0;
			}
		}
	}
}