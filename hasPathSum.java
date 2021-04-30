public class hasPathSum {
    private int cur = 0;
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root.left == null && root.right == null){
            if(cur + root.val == targetSum){
                return true;
            }
            return false;
        }
        cur += root.val;
        if(cur > targetSum){
            cur -= root.val;
            return false;
        }
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
