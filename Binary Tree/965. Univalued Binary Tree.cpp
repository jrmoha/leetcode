/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
    private:
    bool isleaf(TreeNode *root)
{
    return root != nullptr && root->left == nullptr && root->right == nullptr;
}
public:
    bool isUnivalTree(TreeNode* root) {
        if (!root||isleaf(root))
        return true;
    bool eq = true;
    if (root->left)
        eq = (eq && root->val == root->left->val);
    if (root->right)
        eq = (eq && root->val == root->right->val);
    bool left = isUnivalTree(root->left);
    bool right = isUnivalTree(root->right);
    return eq && left && right;
    }
};