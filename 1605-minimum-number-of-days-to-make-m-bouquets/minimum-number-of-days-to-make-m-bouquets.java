class Solution {
    public boolean possible(long day,int[] bloomDay, int m,int k){
        long count=0;
        long bouquet=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                bouquet+=count/k;
                count=0;
            }
        }
        bouquet+=count/k;
        if(bouquet>=m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;
     for(int i=0;i<bloomDay.length;i++)
     {
        min=Math.min(min,bloomDay[i]);
        max=Math.max(max,bloomDay[i]);
     }
     long low=min;
     long high=max;
     while(low<=high){
        long mid=(low+high)/2;
        if(possible(mid,bloomDay,m,k)){
            high=mid-1;
        }
        else low=mid+1;
     }    
     return (int)low;   
    }
}