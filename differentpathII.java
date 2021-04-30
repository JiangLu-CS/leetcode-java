public class differentpathII {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0,1},{0,0}};
        uniquePathsWithObstacles(arr);
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i = 0; i < obstacleGrid.length; i++){
            for(int j = 0; j < obstacleGrid[0].length; j++){
                if((i == 0 || j == 0) && obstacleGrid[i][j] == 0){
                    dp[i][j] = 1;
                    continue;
                }
                if(obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
