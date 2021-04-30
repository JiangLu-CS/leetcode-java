import java.util.*;

public class erchashuqianxubianli {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.pop();
            if(temp != null){
                list.add(temp.val);
                queue.push(temp.right);
                queue.push(temp.left);
            }
        }
        return list;
    }
}
