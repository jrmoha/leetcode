class Solution {
public:
    int sqrt(int x) {
        long left=0;
    long right=x;
    while(left<right)
    {
        long mid=left+(right-left+1)/2;
        if(mid*mid<=x)
        {
            left=mid;
        }
        else
        {
            right=mid-1;
        }
    }
    return left;
    }
    bool isPerfectSquare(int num) {
        int sq=sqrt(num);
        return sq*sq==num; 
    }
};