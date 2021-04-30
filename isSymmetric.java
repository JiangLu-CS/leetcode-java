public class isSymmetric {
    public boolean sub(TreeNode a, TreeNode b) {
        if(a == null && b == null){
            return true;
        }
        if(a == null || b == null){
            return false;
        }
        if (a.val == b.val) {
            return sub(a.left, b.right) && sub(a.right, b.left);
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root){
        if(root == null ){
            return true;
        }
        return sub(root.left, root.right);
    }



}
