class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int maxArea=0;
        boolean [] visited=new boolean[grid.length];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    int area=dfs(grid, i, j, rows, cols);
                    maxArea=Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
    }
    private int dfs(int[][] grid, int r, int c,
                    int rows, int cols) {

        if (r < 0 || c < 0 ||
            r >= rows || c >= cols ||
            grid[r][c] == 0) {
            return 0;
        }

        grid[r][c] = 0;

        int area = 1;

        area += dfs(grid, r - 1, c, rows, cols);
        area += dfs(grid, r + 1, c, rows, cols);
        area += dfs(grid, r, c - 1, rows, cols); 
        area += dfs(grid, r, c + 1, rows, cols);

        return area;
    }
}
