class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
          int n=nums.size();
    std::vector<int> left(n),right(n);
    int j=n-1;
    left[0]=1;
    right[j]=1;
    for(int i=0; i<n; i++)
    {
        if(i-1>=0)left[i]=nums[i-1]*left[i-1];
        if(j+1<n)right[j]=nums[j+1]*right[j+1];
        j--;
    }
    for(int i=0; i<n; i++)nums[i]=left[i]*right[i];
    return nums;
    }
};