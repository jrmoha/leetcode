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
    void solve(TreeNode* root, std::vector<int>& res, int depth) {
        if (root) {
            if (res.size() == depth)
                res.push_back(root->val);
            solve(root->right, res, depth + 1);
            solve(root->left, res, depth + 1);
        }
    }

public:
    std::vector<int> rightSideView(TreeNode* root) {
        std::vector<int> result;
        if (!root)
            return result;
        solve(root, result, 0);
        return result;
    }
};