class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer>ans=new ArrayList<>();
       boolean[] arr=new boolean[1001];
       for(int i=0;i<nums1.length;i++)
       {
        int num=nums1[i];
        arr[num]=true;
       }
       for(int i=0;i<nums2.length;i++)
       {
        int num=nums2[i];
        if(arr[num]==true){
          ans.add(num);
          arr[num]=false;
        }
       }
       int ans1[]=new int[ans.size()];
       for(int i=0;i<ans.size();i++)
       {
         ans1[i]=ans.get(i);
       }
       return ans1;
    }
}