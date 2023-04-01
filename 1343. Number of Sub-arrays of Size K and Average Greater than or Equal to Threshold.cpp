int numOfSubarrays(vector<int>& arr, int k, int threshold) {
        int cnt=0;int n=arr.size();
        for(int i=0;i<n;i++){
            if(i-1>=0)arr[i]+=arr[i-1];
            if(i==k-1){
                if(arr[i]/k*1.0>=threshold)cnt++;
            }
            else if(i-k>=0){
                long sum=arr[i]-arr[i-k];
                if(sum/k*1.0>=threshold)cnt++;
            }
        }
        return cnt;
}
