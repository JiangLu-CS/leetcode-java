public class exist {


    public boolean exist(char[][] board, String word){
        if(board == null || board.length == 0 || board[0].length == 0){
            if(word == null || word.length() == 0){
                return true;
            }
            return false;
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[0].length; y++){
                if(board[x][y] == word.charAt(0)){
                    if(hasroute(x, y, board, visited, word, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean hasroute(int x, int y, char[][] board, boolean[][] visited, String word, int index){
        if(word.length() == index){
            return true;

        }
        if(x < 0 || y < 0 || x > board.length - 1 || y > board[0].length - 1
                || visited[x][y] || word.charAt(index) != board[x][y]){
            return false;
        }
        visited[x][y] = true;

        boolean res =  hasroute(x + 1, y, board, visited, word, index + 1)
                || hasroute(x, y + 1, board, visited,word, index + 1)
                || hasroute(x - 1, y, board, visited, word,index + 1)
                || hasroute(x, y - 1, board, visited, word,index + 1);
        visited[x][y] = false;
        return res;
    }
}
