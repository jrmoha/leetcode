class Solution {
public:
    int majorityElement(vector<int>& nums) {
        std::map<int,int> mp;
        int mx=nums[0];
        int cnt=0;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        for(auto it:mp){
            if(it.second>cnt){
                cnt=it.second;
                mx=it.first;
            }
        }
        return mx;
    }
};