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
    return root!=nullptr && root->left == nullptr && root->right == nullptr;
}
public:
    bool hasPathSum(TreeNode* root, int targetSum) {
        if(!root)return 0;
        if(isleaf(root)&&targetSum-root->val==0)return 1;
        return hasPathSum(root->left,targetSum-root->val)||hasPathSum(root->right,targetSum-root->val);
    }
};