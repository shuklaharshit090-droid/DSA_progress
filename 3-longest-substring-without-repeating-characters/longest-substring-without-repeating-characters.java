class Solution {
    public int lengthOfLongestSubstring(String s) {
        int k=0;
        int maxsub=-1;
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        int freq[]=new int[128];
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)-'a')>=0 && (s.charAt(i)-'a')<26)
            {
            if(freq[s.charAt(i)-'a']==1)
            {
                maxsub=Math.max(maxsub,i-k);
                while(freq[s.charAt(i)-'a']!=0)
                {
                    if((s.charAt(k)-'a'>=0) && (s.charAt(k)-'a'<26))
                        {
                            freq[s.charAt(k)-'a']--;
                        }
                        else{
                        freq[s.charAt(k)]--;
                        }
                        k++;
                }
            }
            freq[s.charAt(i)-'a']++;
            maxsub=Math.max(maxsub,i-k+1);
            }
            else{
                if(freq[s.charAt(i)]==1)
                {
                    maxsub=Math.max(maxsub,i-k);
                    while(freq[s.charAt(i)]!=0)
                    {
                        if((s.charAt(k)-'a'>=0) && (s.charAt(k)-'a'<26))
                        {
                            freq[s.charAt(k)-'a']--;
                        }
                        else{
                        freq[s.charAt(k)]--;
                        }
                        k++;
                    }
                }
                freq[s.charAt(i)]++;
                maxsub=Math.max(maxsub,i-k+1);
            }
        }
        return maxsub;
    }
}