class Solution {
    public long removeZeros(long n) {
        long ans=0;
        ArrayList<Long>arr=new ArrayList<>();
        while(n!=0){
            if(n%10!=0) arr.add(n%10);
            n=n/10;
        }
        for(int i=arr.size()-1;i>=0;i--)
        {
            ans=ans*10+arr.get(i);
        }
        return ans;
    }
}