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
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        std::vector<std::vector<int>> res;
    if(!root)return res;
    std::queue<TreeNode *> q;
    q.push(root);
    q.push(NULL);
    //res.push_back({root->val});
    std::vector<int> v;
    while (!q.empty())
    {
        TreeNode *t = q.front();
        
        q.pop();
        if (t == NULL)
        {
            res.push_back(v);
            v.clear();
            if (!q.empty())
                q.push(NULL);
        }
        else
        {
            v.push_back(t->val);
            if (t->left)
                q.push(t->left);
            if (t->right)
                q.push(t->right);
        }
    }
    return res;
    }
};