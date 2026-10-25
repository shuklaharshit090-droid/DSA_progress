class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!map.containsKey(key))
            {
                List<String>a=new ArrayList<>();
                a.add(strs[i]);
               map.put(key,a);
            }
            else{
                List<String>a=map.get(key);
                a.add(strs[i]);
                // map.put(key.toString(),a);
            }
        }
        List<List<String>>ans=new ArrayList<>();
        for(String temp:map.keySet())
        {
            ans.add(map.get(temp));
        }
        return ans;
    }
}