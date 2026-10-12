class Solution {
    // int count=0;
    public int dfs(int[][] grid,int i,int j)
    {
        int m=grid.length;
        int n=grid[0].length;
        if(i<0||i>=m||j<0||j>=n||grid[i][j]==0)
        {
            // count++;
            return 1;
        }
        if(grid[i][j]==-1) return 0;
        grid[i][j]=-1;
        return dfs(grid,i+1,j)+dfs(grid,i-1,j)+dfs(grid,i,j+1)+dfs(grid,i,j-1);
    }
    public int islandPerimeter(int[][] grid) {
      int m=grid.length;
      int n=grid[0].length;
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(grid[i][j]==1)
          {
           return dfs(grid,i,j);
          }
        }
      }  
     return 0;
    }
}