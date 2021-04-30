public class kthLargest {
    private int count = 0;
    int res = 0;
    public int kthLargest(TreeNode root, int k){
        if(root == null){
            return 0;
        }
        kthLargest(root.right, k);
        int val = root.val;
        count++;
        if(count == k){
            res = val;
        }
        kthLargest(root.left, k);
        return res;
    }
}
