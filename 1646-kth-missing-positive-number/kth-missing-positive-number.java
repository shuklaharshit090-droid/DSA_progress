class Solution {
    public int findKthPositive(int[] arr, int k) {
    // // brute force 
    // for(int i=0;i<arr.length;i++)
    // {
    //     if(arr[i]<=k) k++;
    //     else break;
    // }  
    // return k;  
    // }
    int l=0;
    int h=arr.length-1;
    while(l<=h) {
        int mid=l+(h-l)/2;
        int missing=arr[mid]-mid-1;
        if(missing<k) l=mid+1;
        else h=mid-1;
    }
    return h+1+k;
    }
}