// public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class inordertraversal {
    List<Integer> myList = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return myList;
        } else {
            if (root.left != null) {

                inorderTraversal(root.left);
            }
            myList.add(root.val);
            if (root.right != null) {
                inorderTraversal(root.right);

            }

        }
        return myList;
    }
}
