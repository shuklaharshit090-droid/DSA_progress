class Solution {
    public int islandPerimeter(int[][] grid) {
       int m=grid.length;
       int n=grid[0].length;
       boolean[][] visited=new boolean[m][n];
       Queue<int[]>q=new LinkedList<>();
       int[] dx={1,-1,0,0};
       int[] dy={0,0,1,-1};
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]==1)
            {
              q.offer(new int[]{i,j});
              visited[i][j]=true;
              int perimeter=0;
              while(!q.isEmpty())
              {
                int[] cell=q.poll();
                int r=cell[0];
                int c=cell[1];

                for(int d=0;d<4;d++)
                {
                    int nr=r+dx[d];
                    int nc=c+dy[d];
                    if(nr<0||nc<0||nr>=m||nc>=n||grid[nr][nc]==0){
                        perimeter++;
                    }
                    else if(!visited[nr][nc]){
                        visited[nr][nc]=true;
                        q.offer(new int[]{nr,nc});
                    }
                }
              }
              return perimeter;
            }
        }
       } 
       return 0;
    }
}