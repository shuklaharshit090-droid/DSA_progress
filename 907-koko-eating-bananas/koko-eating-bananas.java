class Solution {
    public long hours(long a,int piles[])
    {
        long totalhours=0;
        for(int i=0;i<piles.length;i++)
        {
            totalhours+=(long)Math.ceil((double)piles[i]/a);
        }
       return totalhours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            max=Math.max(max,piles[i]);
        }
        long ans=0;
        long low=1;
        long high=max;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(hours(mid,piles)<=h)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)ans;
    }
}