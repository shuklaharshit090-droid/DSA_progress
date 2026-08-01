class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
        if(nums[i]<pivot)
        {
            list1.add(nums[i]);
        }
        else if(nums[i]>pivot)
        {
            list2.add(nums[i]);
        }
        else{
            list3.add(nums[i]);
        }
        }
        int ans[]=new int[nums.length];
        int k=0;
        for(int i=0;i<list1.size();i++)
        {
            ans[k++]=list1.get(i);
        }
        for(int l=0;l<list3.size();l++)
        {
            ans[k++]=list3.get(l);
        }
        for(int j=0;j<list2.size();j++)
        {
            ans[k++]=list2.get(j);   
        }
        return ans;
    }
}