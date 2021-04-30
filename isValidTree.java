public class isValidTree {
    int min = Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        if(isValidBST(root.left)){
            if(root.left != null){
                min = Math.max(min, root.left.val);
            }
            if(root.right != null && root.right.val > min){
                return isValidBST(root.right);
            }
            if(root.right == null){
                return true;
            }
        }
        return false;
    }
}
