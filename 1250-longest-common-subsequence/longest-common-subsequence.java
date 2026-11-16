class Solution {
    // public int lcs(String text1,String text2,int m,int n,int memo[][])
    // {
    //     if(m==0 || n==0) return memo[m][n]=0;
    //     if(memo[m][n]!=-1) return memo[m][n];
    //     if(text1.charAt(m-1)==text2.charAt(n-1)) return memo[m][n]=1+lcs(text1,text2,m-1,n-1,memo);
    //     else{
    //         return memo[m][n]=Math.max(lcs(text1,text2,m-1,n,memo),lcs(text1,text2,m,n-1,memo));
    //     }
    // }
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0){
                    dp[i][j]=0;
                }
                else if(j==0){
                    dp[i][j]=0;
                }
                else{
                   if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                   }
                   else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                   }
                }
            }
        }
        return dp[m][n];
    }
}