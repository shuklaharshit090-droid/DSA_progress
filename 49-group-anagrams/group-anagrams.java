class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:strs)
        {
            int[] freq=new int[26];
            for(char c:s.toCharArray())
            {
                freq[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i:freq){
                sb.append("#");
                sb.append(i);
            }
            String key=sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
                map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}