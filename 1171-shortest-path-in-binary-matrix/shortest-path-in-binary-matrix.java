class Solution {
    public class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][]directions={{-1,-1},{-1,0},{-1,1},{1,0},{1,-1},{1,1},{0,-1},{0,1}};
        if(m<=0 || n<=0 || grid[0][0]==1){
            return -1;
        }
        Queue<Pair>qt=new LinkedList<>();
        qt.offer(new Pair(0,0));
        int level=0;
        while(!qt.isEmpty())
        {
            int N=qt.size();
            while(N>0)
            {
                Pair p=qt.poll();
                int x=p.x;
                int y=p.y;
                if(x==m-1 && y==n-1) return level+1;
                for(int[]dir:directions)
                {
                    int nx=x+dir[0];
                    int ny=y+dir[1];
                    if(nx>=0 && ny>=0 && nx<=m-1 && ny<=n-1 && grid[nx][ny]==0)
                    {
                        grid[nx][ny]=1;
                        qt.offer(new Pair(nx,ny));
                    }
                }
                N--;
            }
            level++;
        }
        return -1;
    }
}