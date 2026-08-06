class Solution {
    public int prod(int k)
    {
        int temp=1;
        while(k!=0)
        {
            temp=temp*(k%10);
            k=k/10;
        }
        return temp;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++)
        {
            if((prod(i)%t)==0) return i;
        }
        return -1;
    }
}