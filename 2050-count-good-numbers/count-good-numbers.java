class Solution {
    long m=(long)Math.pow(10,9)+7;
    public long pow(long a,long b)
    {
        if(b==0) return 1;
        long half=pow(a,b/2);
        long ans=(half*half)%m;
        if(b%2==1)
        {
            ans=(ans*a)%m;
        }
        return ans;
    }
    public int countGoodNumbers(long n) {
        long oddindices=n/2;
        long evenindices=(n+1)/2;
        return (int)((pow(5,evenindices)*pow(4,oddindices))%m);
    }
}