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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return arr ;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            arr.add(node.val);
            if(node.left!=null){
                stack.add(node.left);
            }if(node.right!=null){
                stack.add(node.right);
            }
        }
        Collections.reverse(arr);
        return arr;
    }
}