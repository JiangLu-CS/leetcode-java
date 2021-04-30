import java.util.ArrayList;
import java.util.List;

public class levelOrder3 {
    List<List<Integer>> node=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        lei(root,0);
        return node;
    }
    public void lei(TreeNode root,int k){
        if(root!=null){
            if(node.size()<=k){
                node.add(new ArrayList<>());
            }
            node.get(k).add(root.val);
            if(k % 2 == 0){
                lei(root.left,k+1);
                lei(root.right,k+1);
            }else{
                lei(root.right,k+1);
                lei(root.left,k+1);
            }

        }
    }
}
