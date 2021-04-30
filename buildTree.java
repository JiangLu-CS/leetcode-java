import java.util.Arrays;

public class buildTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


  public TreeNode buildTree(int[] preorder, int[] inorder){

        if(preorder == null|| inorder == null || preorder.length == 0 || inorder.length == 0){
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        int i = 0;

        while(inorder[i] != preorder[0]){
            i++;

            if(inorder[i] == preorder[0]){
                break;
            }
        }

        root.left = buildTree(Arrays.copyOfRange(preorder, 1, i + 1),
                Arrays.copyOfRange(inorder, 0, i));

        root.right = buildTree(Arrays.copyOfRange(preorder, i + 1, preorder.length),
                Arrays.copyOfRange(inorder, i + 1, inorder.length));

        return root;
      //(Arrays.copyOfRange(preorder, 1, 1 + rootIndex), Arrays.copyOfRange(inorder, 0, rootIndex));
      //buildTree(Arrays.copyOfRange(preorder, 1 + rootIndex, n), Arrays.copyOfRange(inorder, rootIndex + 1, n));




  }

}
