public class findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        if(matrix == null || m == 0 || n == 0){
            return false;
        }

        if(matrix[0][0] > target || matrix[m][n] < target){
            return false;
        }

        int i = 0;
        int j = n - 1;
        while(i < m && j > 0){
            if(target == matrix[i][j]){
                return true;
            }
            if(target > matrix[i][j]){
                i++;
            }else{
                j--;
            }
        }


        return false;
    }
}
