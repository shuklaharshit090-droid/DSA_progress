class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        if(len==0)
        return 0;
        int max=1;
        int l=0,r=1;
        HashSet<Character> set=new HashSet<>();
        set.add(s.charAt(0));
        while(r<len && l<len)
        {
            if(!set.contains(s.charAt(r)))
            {
                set.add(s.charAt(r));
                r++;
            }
            else
            {
                max=Math.max(max,set.size());
                set.remove(s.charAt(l));
                l++;
            }
        }
        max=Math.max(max,set.size());
        return max;
    }
}