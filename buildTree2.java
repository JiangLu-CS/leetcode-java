import java.lang.reflect.Array;
import java.util.Arrays;

public class buildTree2 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int i = 0;
        while(i < inorder.length && inorder[i] != preorder[0]){
            i++;
        }
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + i), Arrays.copyOfRange(inorder, 0, i- 1));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + i, preorder.length), Arrays.copyOfRange(inorder, i + 1, inorder.length));
        return root;

    }

}
