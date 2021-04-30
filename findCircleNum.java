public class findCircleNum {
    //20:08

    public static void main(String[] args) {
        int[][] isCon = new int[][]{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        System.out.println(findCircleNum(isCon));
    }

     public static int findCircleNum(int[][] isConnected){
        int cityNum = 0;
        boolean[] isVisited = new boolean[isConnected[0].length];
        for(int i = 0; i < isConnected.length; i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                cityNum++;
                dfs(isConnected, isVisited, i);
            }
        }
        return cityNum;
    }
    public static void dfs(int[][] isConnected, boolean[] isVisited, int x){
        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[x][i] == 1 && !isVisited[i]){
                isVisited[i] = true;
                dfs(isConnected, isVisited,  i);
            }
        }

    }
}
