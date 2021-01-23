/* Leetcode Problem 200 No of Islands
https://leetcode.com/problems/number-of-islands/
*/
class NumberOfIslands{
	
	public static void main(String args[]){
		
		char grid[][]={{'1','1','1','1','0'},
					  {'1','1','0','1','0'},
					  {'1','1','0','0','0'},
					  {'0','0','0','0','0'}};
					  
		System.out.println("No of islands in current grid is "+findIslands(grid));
	}
	
	public static int findIslands(char grid[][]){
		
		int islandCount=0;
		int rows=grid.length;
		if(rows==0){
			
			System.out.println("No islands found");
		}
		
		int cols=grid[0].length;
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				
				if(grid[i][j]=='1'){
					markVisited(grid,i,j,rows,cols);
					islandCount++;
				}
			}
		}
		return islandCount;
	}
	
	public static void markVisited(char grid[][],int x,int y,int rows,int cols){
		
		//Checking the boundary conditions and ensuring whether current value is not a new island
		if(x<0 || x>=rows || y<0 || y>=cols || grid[x][y]!='1'){
			
			return;	
		}
		grid[x][y]='2'; // Every current cell as 2 which shows visited.
		
		//Now checking vertically and horizontally in each direction for islands
		markVisited(grid,x-1,y,rows,cols);  //UP
		markVisited(grid,x+1,y,rows,cols);  //DOWN
		markVisited(grid,x,y-1,rows,cols);  //LEFT
		markVisited(grid,x,y+1,rows,cols);  //RIGHT
	}
}