class Solution {
    public int[] asteroidCollision(int[] nums) {
       ArrayList<Integer>ans=new ArrayList<>();
       Stack<Integer>st=new Stack<>();
       for(int i=0;i<nums.length;i++)
       {
        boolean flag=false;
          if(nums[i]>0) st.push(nums[i]);
          else{
            while(st.size()>0 && st.peek()>0)
            {
                int peek=st.pop();
                if(Math.abs(nums[i])>peek)
                {
                  continue;
                }
                else if(Math.abs(nums[i])==peek)
                {
                    flag=true;
                    break;
                }
                else{
                    st.push(peek);
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                st.push(nums[i]);
            }
          }
        //   st.push(nums[i]);
       } 
       while(!st.isEmpty())
       {
        ans.add(st.pop());
       }
       int[] arr=new int[ans.size()];
       int k=0;
       for(int i=ans.size()-1;i>=0;i--)
       {
         arr[k]=ans.get(i);
         k++;
       }
    //    Arrays.sort(arr);
       return arr;
    }
}