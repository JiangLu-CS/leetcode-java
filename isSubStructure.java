public class isSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B){

        if(B == null || A == null){
            return false;
        }
        return dfs(A, B);
    }
    public boolean dfs(TreeNode A, TreeNode B){
        if(A == null){
            return false;
        }
        if(B == null){
            return true;
        }
        if (A.val != B.val){
            return dfs(A.left, B) || dfs(A.right, B);
        }else{
            return dfs(A.left, B.left) && dfs(A.right, B.right);
        }


    }
}

