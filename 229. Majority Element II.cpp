class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
     std::map<int,int> mp;
        std::vector<int> vec;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        for(auto it:mp){
            if(it.second>nums.size()/3){
               vec.push_back(it.first);
            }
        }
        return vec;
    }
};