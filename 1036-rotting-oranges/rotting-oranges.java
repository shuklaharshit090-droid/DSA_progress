class Solution {
    int count=0;
    int time=0;
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]>qt=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1) count++;
                else if(grid[i][j]==2) qt.offer(new int[]{i,j});
            }
        }
        int []dx={-1,1,0,0};
        int []dy={0,0,-1,1};
        while(!qt.isEmpty() && count>0)
        {
            int size=qt.size();
            for(int x=0;x<size;x++)
            {
                int []cell=qt.poll();
                int r=cell[0];
                int c=cell[1];
                for(int d=0;d<4;d++)
                {
                    int nr=r+dx[d];
                    int nc=c+dy[d];
                 if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]==1){
                  grid[nr][nc]=2;
                  count--;
                  qt.offer(new int[]{nr,nc});
                 }
            }
        }
        time++;
    }
    return (count==0)?time:-1;
}
}