class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
       ArrayList<Integer>ans=new ArrayList<>();
       int n=arr.length;
       ans.add(arr[n-1]);
       int rmax=arr[n-1];
       for(int i=n-2;i>=0;i--)
       {
           if(arr[i]>=rmax)
           {
               rmax=arr[i];
               ans.add(arr[i]);
           }
       }
       Collections.reverse(ans);
       return ans;
    }
}
