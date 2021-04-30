public class lowestCommonAncestorII {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(hastree(root.left, p) && hastree(root.left, q)){
            return lowestCommonAncestor(root.left, p, q);
        }else if(hastree(root.right, p) && hastree(root.right, q)){
            return lowestCommonAncestor(root.right, p, q);
        }else {
            return root;
        }

    }
    public boolean hastree(TreeNode root, TreeNode p){
        if (root == p){
            return true;
        }
        if(root == null){
            return false;
        }
        return hastree(root.left, p) || hastree(root.right, p);
    }
}
