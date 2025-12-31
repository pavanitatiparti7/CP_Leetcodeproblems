/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> leftq=new LinkedList<>();
        Queue<TreeNode> rightq=new LinkedList<>();

        //skipping level 0 and starting from level 1
        leftq.add(root.left);
        rightq.add(root.right);

        while(!leftq.isEmpty() && !rightq.isEmpty()){
            //Fetching nodes
            TreeNode leftnode=leftq.poll();
            TreeNode rightnode=rightq.poll();

            if(leftnode==null && rightnode==null){
                continue;
            }
            if(leftnode==null || rightnode==null || leftnode.val != rightnode.val){
                return false;
            }
            leftq.add(leftnode.left);
            leftq.add(leftnode.right);
            rightq.add(rightnode.right);
            rightq.add(rightnode.left);

        }
        return true;
        
    }
}
