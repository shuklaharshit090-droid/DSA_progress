class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3) return s;
        StringBuilder ans=new StringBuilder();
        ans.append(s.charAt(0));
        int count=1;
        int i=1;
        int freq=0;
        while(i<s.length())
        {
            if(s.charAt(i)==(ans.charAt(ans.length()-1)))
            {
                count++;
                if(count<3)
                {
                    ans.append(s.charAt(i));
                }
            }
            else{
                ans.append(s.charAt(i));
                count=1;
            }
            i++;
            // freq++;
        }
        return ans.toString();
    }
}