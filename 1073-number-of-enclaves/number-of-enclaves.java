class Solution {
    public void dfs(int[][] grid,int[][]vis,int i,int j)
    {
        if(i<0 || j<0 || i>=grid.length||j>=grid[0].length||vis[i][j]==1||grid[i][j]==0){
            return;
        }
        vis[i][j]=1;
        dfs(grid,vis,i+1,j);
        dfs(grid,vis,i-1,j);
        dfs(grid,vis,i,j+1);
        dfs(grid,vis,i,j-1);
    }
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]vis=new int[m][n];
        int i=0;
        for(int j=0;j<n;j++)
        {
        if(grid[i][j]==1){
            dfs(grid,vis,i,j);
        }
        }
        i=m-1;
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]==1)
            {
                dfs(grid,vis,i,j);
            }
        }
        int y=0;
        for(int x=0;x<m;x++)
        {
            if(grid[x][y]==1)
            {
                dfs(grid,vis,x,y);
            }
        }
        y=n-1;
        for(int x=0;x<m;x++)
        {
            if(grid[x][y]==1)
            {
                dfs(grid,vis,x,y);
            }
        }
        int count=0;
        for(i=1;i<m-1;i++)
        {
            for(int j=1;j<n-1;j++)
            {
                if(grid[i][j]==1 && vis[i][j]==0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}