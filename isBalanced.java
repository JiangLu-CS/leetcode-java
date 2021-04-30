public class isBalanced {
    public boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }
        if( Math.abs(depth(root.left) - depth(root.right)) >= 2){
            return false;
        }else {
            return isBalanced(root.left) && isBalanced(root.right);
        }

    }
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
