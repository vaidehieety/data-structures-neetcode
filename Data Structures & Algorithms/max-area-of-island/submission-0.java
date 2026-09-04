class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        //int maxSize= Integer.MIN_VALUE
        //iterate through all of the grid
        //when we hit 1, we go check the size. 
        //we check if that particular size is greater than the max height
        //update if it is 

        int maxSize= 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    int size=dfsSize(grid, i, j);
                    if(size>maxSize){
                        maxSize=size;
                    }
                }
            }
        }

        return maxSize;
    }
    //within dfs
    //we add all the sides and the neighbours and plus 1 we send back

    public int dfsSize(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }

        grid[i][j]=0;
        int size= dfsSize(grid, i+1, j) + dfsSize(grid, i-1, j) + dfsSize(grid, i, j+1) + dfsSize(grid, i, j-1);

        return 1+size;
    }
}
