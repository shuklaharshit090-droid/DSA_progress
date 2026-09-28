class Pair implements Comparable<Pair>{
    int dist;
    int y;
    Pair(int dist,int y){
        this.dist=dist;
        this.y=y;
    }
    public int compareTo(Pair P){
        if(this.dist!=P.dist)
      return Integer.compare(this.dist,P.dist);
    return Integer.compare(this.y,P.y);
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        for(int i:arr){
            int dist=Math.abs(i-x);
            int y=i;
            pq.add(new Pair(dist,y));
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
          Pair P=pq.remove();
          ans.add(P.y);
        }
        Collections.sort(ans);
        return ans;
    }
}