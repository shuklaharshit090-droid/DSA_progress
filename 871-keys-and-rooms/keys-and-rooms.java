class Solution {
    boolean ans=true;
    public void dfs(int idx,List<List<Integer>> rooms,int[] visited)
    {
        visited[idx]=1;
        for(int x:rooms.get(idx))
        {
            if(visited[x]==0)
            dfs(x,rooms,visited);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        int[] visited=new int[n];
        Arrays.fill(visited,0);
        dfs(0,rooms,visited);
        for(int i=0;i<n;i++)
        {
            if(visited[i]==0) return false;
        }
        return true;
    }
}