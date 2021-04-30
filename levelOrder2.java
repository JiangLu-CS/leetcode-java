import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        int count1 = 0;
        int count2 = 0;
        int level = 1;
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        List<Integer> temp = new ArrayList<>(root.val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        result.add(temp);
        temp.clear();
        count1++;
        while(!queue.isEmpty()){
            if(queue.element().left != null){
                queue.offer(queue.element().left);
                if (level % 2 == 1) {
                    count2++;
                    temp.add(queue.element().val);
                } else {
                    count1++;
                    temp.add(queue.element().val);
                }
            }
            if(queue.element().right != null){
                queue.offer(queue.element().right);
                if (level % 2 == 1) {
                    count2++;
                    temp.add(queue.element().val);
                } else {
                    count1++;
                    temp.add(queue.element().val);
                }
            }
            queue.poll();
            if (level % 2 == 0) {
                count2--;
            } else {
                count1--;
            }
            if((count1 == 0 && level % 2 == 1) || (count2 == 0 && level % 2 == 0)){
                level++;
                result.add(temp);
                temp.clear();
            }


        }
        return result;
    }
}
