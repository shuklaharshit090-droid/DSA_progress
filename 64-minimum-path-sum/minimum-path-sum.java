class Solution {
    public int solve(int grid[][],int i,int j,int m,int n,int memo[][]){
        if(i==m-1 && j==n-1) return grid[i][j];
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(memo[i][j]!=-1) return memo[i][j];
        int down=solve(grid,i+1,j,m,n,memo);
        int right=solve(grid,i,j+1,m,n,memo);
        return memo[i][j]=grid[i][j]+Math.min(down,right);
    }
    public int minPathSum(int[][] grid) {
       int m=grid.length;
       int n=grid[0].length;
       int memo[][]=new int[m+1][n+1];
       for(int a[]:memo)
       {
        Arrays.fill(a,-1);
       } 
       return solve(grid,0,0,m,n,memo);
    }
}