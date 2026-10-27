class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int m=image.length;
       int n=image[0].length;
       int oldcolor=image[sr][sc];
       if(oldcolor==color) return image;
       boolean[][] visited=new boolean[m][n];
       Queue<int[]>qt=new LinkedList<>();
       int[] dx={-1,1,0,0};
       int[] dy={0,0,-1,1};
       qt.offer(new int[]{sr,sc});
       visited[sr][sc]=true;
       image[sr][sc]=color;
       while(!qt.isEmpty())
       {
         int cell[]=qt.poll();
         int r=cell[0];
         int c=cell[1];
         for(int i=0;i<4;i++)
         {
            int nr=r+dx[i];
            int nc=c+dy[i];
            
            if(nr>=0 && nc>=0 && nr<m && nc<n && !visited[nr][nc] && image[nr][nc]==oldcolor){
                image[nr][nc]=color;
                visited[nr][nc]=true;
                qt.offer(new int[]{nr,nc});
            }
         }
       } 
       return image; 
    }
}