class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<s.length()-9;i++)
        {
            String temp=s.substring(i,i+10);
            if(!map.containsKey(temp))
            {
                map.put(temp,1);
            }
            else{
                map.put(temp,map.get(temp)+1);
            }
        }
        List<String>ans=new ArrayList<>();
        for(String t:map.keySet())
        {
            if(map.get(t)>=2) 
            {
                ans.add(t);
            }
        }
        return ans;
    }
}