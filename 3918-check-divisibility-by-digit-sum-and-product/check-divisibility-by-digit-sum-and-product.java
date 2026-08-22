class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int digitsum=0;
        int prod=1;
        while(temp!=0)
        {
            digitsum+=temp%10;
            prod=prod*(temp%10);
            temp=temp/10;
        }
        return (n%(digitsum+prod)==0);
    }
}