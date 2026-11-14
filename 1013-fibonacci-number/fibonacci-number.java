class Solution {
    public int fibo(int[] memo,int n)
    {
        if(n==0) return memo[n]=0;
        if(n==1) return memo[n]=1;
        if(memo[n]!=-1) return memo[n];
        return memo[n]=fibo(memo,n-1)+fibo(memo,n-2);
    }
    public int fib(int n) {
     int memo[]=new int[n+1];
     Arrays.fill(memo,-1);
     return fibo(memo,n);   
    }
}