class Solution {
    public void dfs(int[] visited,ArrayList<ArrayList<Integer>>list,int node)
    {
        visited[node]=1;
        for(int y:list.get(node))
        {
            if(visited[y]==0)
            {
            dfs(visited,list,y);
            }
        }
    }
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1) return -1;
        int m=connections.length;
        int l=connections[0].length;
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0; i<n;i++)
        {
          list.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++)
        {
            list.get(connections[i][0]).add(connections[i][1]);
            list.get(connections[i][1]).add(connections[i][0]);
        }
        int visited[]=new int[n];
        int result=0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]==0)
            {
                dfs(visited,list,i);
                result++;
            }
        }
        return result-1;
    }
}