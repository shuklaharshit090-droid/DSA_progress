class Solution {
    int maxcount=0;
    public void dfs(int[][] grid,int i,int j,int arr[] )
    {
        int m=grid.length;
        int n=grid[0].length;
        if(i<0||i>=m||j<0||j>=n||grid[i][j]==0) return ;
        arr[0]++;
        grid[i][j]=0;
        dfs(grid,i+1,j,arr);
        dfs(grid,i-1,j,arr);
        dfs(grid,i,j+1,arr);
        dfs(grid,i,j-1,arr);
    }
    public int maxAreaOfIsland(int[][] grid) {
       int m=grid.length;
       int n=grid[0].length;
       int arr[]=new int[1];
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]==1)
            {
                dfs(grid,i,j,arr);
                maxcount=Math.max(maxcount,arr[0]);
                arr[0]=0;
            }
        }
       } 
       return maxcount;
    }
}