class Solution {
    public int tribonacci(int n) {
        int[] tri=new int[n+1];
        tri[0]=0;
         if(n>=1) tri[1]=1;
        if(n>=2)tri[2]=1;
        for(int i=3;i<=n;i++){
            tri[i]=tri[i-3]+tri[i-1]+tri[i-2];
        }
        return tri[n];
    }
}