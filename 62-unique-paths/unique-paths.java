class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        dp[0][0]=1;
        int i=0;
        for(int j=1;j<n;j++){
            dp[i][j]=1;
        }
        int y=0;
        for(int x=1;x<m;x++){
            dp[x][y]=1;
        }
        for(i=1;i<m;i++)
        {
            for(y=1;y<n;y++){
            dp[i][y]=dp[i-1][y]+dp[i][y-1];
            }
        }
        return dp[m-1][n-1];
    }
}