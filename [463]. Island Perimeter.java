class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                if(grid[r][c]==1){
                    perimeter += 4;                // if it's only island, the perimeter is 4++
                    if(r>0&&grid[r-1][c]==1){
                        perimeter -= 2;                //if the row is surronded by water, the perimeter gets reudced by 2
                    }
                    if(c>0&&grid[r][c-1]==1){             ////if the column is surronded by water, the perimeter gets reudced by 2
                        perimeter -= 2;
                    } 
                }
            }
        }
        return perimeter;
    }
}
