class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        int n=s.length();
        int freq1[]=new int[26];
        if(p.length()>s.length()) return ans;
        for(int i=0;i<p.length();i++)
        {
            freq1[p.charAt(i)-'a']++;
        }
        int k=p.length();
        int freq2[]=new int[26];
        for(int i=0;i<k;i++)
        {
            freq2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)) ans.add(0);
        for(int i=k;i<n;i++)
        {
            freq2[s.charAt(i)-'a']++;
            freq2[s.charAt(i-k)-'a']--;
            if(Arrays.equals(freq1,freq2)) ans.add(i-k+1);
        }
        return ans;
    }
}