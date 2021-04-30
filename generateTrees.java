
import java.util.ArrayList;
import java.util.List;
class generateTrees {
    public List<TreeNode> generateTrees(int n){
        List<TreeNode> tree = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            TreeNode a = new TreeNode(i);
            tree.add(a);
        }

    return null;

    }
}
class TreeeNode{
    int val;
      TreeNode left;
      TreeNode right;
      TreeeNode() {}
      TreeeNode(int val) { this.val = val; }
      TreeeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
}
public void convertToTree(TreeNode a, TreeNode b){
    if(a.val < b.val){
        a.right = b;
    }else{
        a.left = b;
    }
    }
}
