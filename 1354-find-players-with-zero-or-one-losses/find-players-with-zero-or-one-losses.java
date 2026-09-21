class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<matches.length;i++)
        {
           map.put(matches[i][0],0);
           map.put(matches[i][1],0);
        }
        for(int i=0;i<matches.length;i++)
        {
            map.put(matches[i][1],map.get(matches[i][1])+1);
            // if(map.get(matches[i][1])>1)
            // map.remove(matches[i][1]);
        }
        List<Integer>zero=new ArrayList<>();
        List<Integer>ones=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==0){
                zero.add(i);
            }
            else if(map.get(i)==1)
            {
                ones.add(i);
            }
        }
        Collections.sort(zero);
        Collections.sort(ones);
        ans.add(zero);
        ans.add(ones);
        return ans;
    }
}