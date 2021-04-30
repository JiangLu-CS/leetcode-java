import java.util.LinkedList;
import java.util.Queue;

public class BFStraining {
    public int shortestPathBinaryMatrix(int[][] grid){
        if(grid.length == 0 || grid[0].length == 0 || grid == null){
            return -1;
        }
        if(grid[0][0] == 1){
            return -1;
        }
        int path = 1;
        Queue<int []> queue = new LinkedList<>();
        int[][] direction = { {0,1},{0, -1},{-1, 0},{1, 0},{1, -1},{-1,1}};
        queue.add(new int[]{0,0});
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            if(x == grid.length - 1 && y == grid[0].length - 1){
                return path;
            }
            for(int[] temp : direction){
                x += temp[0];
                y += temp[1];
                if(x < 0 || y < 0 || x >= grid
                        .length || y >= grid[0].length || grid[x][y] == 1){
                    continue;
                }
                queue.add(new int[]{x, y});
                grid[x][y] = 1;
            }
            path++;
        }
        return -1;
    }
}
