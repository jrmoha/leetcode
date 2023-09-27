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
    int diameterOfBinaryTree(TreeNode* root) {
        if (!root)
        return 0;
    int left_d = diameterOfBinaryTree(root->left);
    int right_d = diameterOfBinaryTree(root->right);
    int left_h = height(root->left);
    int right_h = height(root->right);

    return std::max(left_d, std::max(right_d, left_h + right_h ));
    }
};