class Solution {
public:
    double myPow(double x, int n) {
     if(n==0)
    {
        return 1;
    }
    if(n==1)
    {
        return x;
    }
    double pow=myPow(x,n/2);
    if(n%2==0)
    {
        return pow*pow;
    }
    else
    {
        if(n>0)
        {
            return x*pow*pow;
        }
        else
        {
            return pow*pow/x;
        }
    }}
};