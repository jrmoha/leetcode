class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
         int n=arr.size();
        int mx=arr[n-1];
        arr[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            int tmp=arr[i];
            arr[i]=mx;
            if(tmp>mx)
                mx=tmp;
        }
        return arr;
    }
};