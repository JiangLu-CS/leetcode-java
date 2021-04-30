import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            if(queue.element().left != null){
                queue.offer(queue.element().left);
            }
            if(queue.element().right != null){
                queue.offer(queue.element().right);
            }
            result.add(queue.element().val);
            queue.poll();
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();

    }

}
