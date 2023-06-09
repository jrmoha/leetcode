class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;int[] leftSum=new int[n];int[] rightSum=new int[n];
       for(int i=1;i<n;i++)leftSum[i]=nums[i-1]+leftSum[i-1];
       for(int i=n-2;i>=0;i--)rightSum[i]=nums[i+1]+rightSum[i+1];
       for(int i=0;i<n;i++){
           if(leftSum[i]==rightSum[i])return i;
       }
       return -1;
    }
}