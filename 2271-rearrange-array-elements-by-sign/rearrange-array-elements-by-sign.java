class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>setp=new ArrayList<>();
        ArrayList<Integer>setn=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                setn.add(nums[i]);
            }
            else{
                setp.add(nums[i]);
            }
        }
        int ans[]=new int[nums.length];
        int k1=0;
        int k2=1;
        for(int idx:setp)
        {
          ans[k1]=idx;
          k1=k1+2;
        }
        for(int id:setn)
        {
            ans[k2]=id;
            k2=k2+2;
        }
        return ans;
    }

}