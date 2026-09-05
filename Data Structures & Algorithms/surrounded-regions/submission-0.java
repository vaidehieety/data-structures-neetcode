class Solution {
    public void solve(char[][] grid) {

        //going through the borders
        //left and right row
        for(int i=0; i<grid[0].length; i++){
            markSafe(grid, 0, i);
            markSafe(grid, grid.length-1, i);
        }
        //marking the top and bottom row
        for(int j=0; j<grid.length; j++){
            markSafe(grid, j, 0);
            markSafe(grid, j, grid[0].length-1);
        }

        //change all # back to 0 and 0 to X
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='O'){
                    grid[i][j]='X';
                }else if(grid[i][j]=='#'){
                    grid[i][j]='O';
                }
            }
        }


    }

    public void markSafe(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='O'){
            return;
        }

        grid[i][j]='#';
        markSafe(grid, i+1, j);
        markSafe(grid, i-1, j);
        markSafe(grid, i, j+1);
        markSafe(grid, i, j-1);
    }
}