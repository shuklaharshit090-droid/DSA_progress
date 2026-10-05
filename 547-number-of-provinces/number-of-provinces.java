class Solution {
    public void dfs(int idx,ArrayList<ArrayList<Integer>>arr,boolean[] visited)
    {
        visited[idx]=true;
        for(int i: arr.get(idx)){
            if(!visited[i])
            {
                dfs(i,arr,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer>row=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1) row.add(j);
            }
            arr.add(row);
        }
        boolean[] visited=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                count++;
                dfs(i,arr,visited);
            }
        }
        return count;
    }
}