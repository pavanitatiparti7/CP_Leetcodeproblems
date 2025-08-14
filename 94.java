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
//Inorder (Left, Root, Right)

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Traversal(root, result);
        return result;        
    }
    private void Traversal(TreeNode node, List<Integer>result){
        if (node == null) return;

        Traversal(node.left, result);
        result.add(node.val);
        Traversal(node.right, result);
    }
}
