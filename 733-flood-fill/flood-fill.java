class Solution {
    public void dfs(int [][] grid,int i,int j,int oldcolor,int color){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
            return;
        }
        if(grid[i][j]!=oldcolor) return;
        grid[i][j]=color;
        dfs(grid,i+1,j,oldcolor,color);
        dfs(grid,i-1,j,oldcolor,color);
        dfs(grid,i,j-1,oldcolor,color);
        dfs(grid,i,j+1,oldcolor,color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor=image[sr][sc];
        if(oldcolor==color) return image;
        dfs(image,sr,sc,oldcolor,color);
        return image;
    }
}