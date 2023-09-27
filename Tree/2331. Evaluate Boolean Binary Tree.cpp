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
    bool evaluateTree(TreeNode* root) {
        if(!root)return true;
    if(isleaf(root))return root->val;
    bool left = evaluateTree(root->left);
    bool right = evaluateTree(root->right);
    if(root->val==2)root->val = left||right;
    else root->val = left&&right;
    return root->val;
    }
};