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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        std::vector<std::vector<int>> result;
    if (!root)
        return result;
    std::vector<std::vector<int>> vec;
    std::queue<TreeNode *> q;
    q.push(root);
    bool left_to_right = true;
    while (!q.empty())
    {
        TreeNode *t;
        int s = q.size();
        std::vector<int> v(s);
        for (int i = 0; i < s; i++)
        {
            t = q.front();
            q.pop();
            int index = left_to_right ? i : s - i - 1;
            v[index] = t->val;
            if (t->left)
                q.push(t->left);
            if (t->right)
                q.push(t->right);
        }
        result.push_back(v);
        left_to_right = !left_to_right;
    }
    return result;
    }
};