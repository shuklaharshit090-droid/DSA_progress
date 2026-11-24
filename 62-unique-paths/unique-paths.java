class Solution {
    public int solve(int memo[][],int i,int j,int m,int n){
        if(i==m-1 && j==n-1) return memo[i][j]=1;
        if(i>=m||j>=n) return 0;
        if(memo[i][j]!=-1) return memo[i][j];
        return memo[i][j]=solve(memo,i+1,j,m,n)+solve(memo,i,j+1,m,n);
    }
    public int uniquePaths(int m, int n) {
        int memo[][]=new int[m][n];
        for(int a[]:memo){
            Arrays.fill(a,-1);
        }
        return solve(memo,0,0,m,n);
    }
}