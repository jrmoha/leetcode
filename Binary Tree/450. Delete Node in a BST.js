/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} key
 * @return {TreeNode}
 */
var deleteNode = function(root, val) {
   if (!root) return null;
    if (root.val === val) {
         if (!root.left && !root.right) return null;
        if (!root.left) return root.right;
        if (!root.right) return root.left;
        let right = root.right;
        while (right.left) {
            right = right.left;
        }
        root.val = right.val;
        root.right = deleteNode(root.right,  right.val);
    } else if (root.val > val) {
        root.left = deleteNode(root.left, val);
    } else {
        root.right = deleteNode(root.right, val);
    }
    return root;
};