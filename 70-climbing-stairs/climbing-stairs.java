class Solution {
    public int fibo(int[] memo,int n)
    {
        if(n==1){
            return memo[n]=1;
            // return memo[n];
        }
        if(n==2){
           return memo[n]=2;
        }
        if(memo[n]!=-1) return memo[n];
        return memo[n]= fibo(memo,n-1)+fibo(memo,n-2);
    }
    public int climbStairs(int n) {
       int memo[]=new int[n+1];
       for(int i=0;i<=n;i++)
       {
        memo[i]=-1;
       }
    return fibo(memo,n);
    //  return memo[n];
    //    return memo[n];
    }
}