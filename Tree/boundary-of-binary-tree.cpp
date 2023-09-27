 class Solution {
    private:
    bool isleaf(Node *root)
{
    return root != nullptr && root->left == nullptr && root->right == nullptr;
}
    void left(TreeNode* root,std::vector<int> &res){
    if(!root||isleaf(root))return;
    res.push_back(root->val);
    if(root->left)left(root->left,res);
    else left(root->right,res);
 }
 void leafs(TreeNode* root,std::vector<int> &res){
    if(!root)return;
    if(isleaf(root)){
        res.push_back(root->val);
        return;
    }
    leafs(root->left,res);
    leafs(root->right,res);
 }
 void right(TreeNode* root,std::vector<int> &res){
    if(!root||isleaf(root))return;
    if(root->right)right(root->right,res);
    else right(root->left,res);
    res.push_back(root->val);
 }
public:
    std::vector<int> boundary(Node *root)
{
    std::vector<int> res;
    if (!root)
        return res;
    res.push_back(root->val);
    if(isleaf(root))return res;
    left(root->left, res);
    leafs(root, res);
     right(root->right, res);
    return res;
}
};