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
    int height(TreeNode *root)
{
    if (!root)
        return 0;
    int left = height(root->left);
    int right = height(root->right);
    return 1 + std::max(left, right);
}
public:
    bool isBalanced(TreeNode* root) {
        if (!root)
        return true;
    int left = height(root->left);
    int right = height(root->right);
    if (std::abs(left - right) > 1)
        return false;
    return isBalanced(root->left) && isBalanced(root->right);
    }
};