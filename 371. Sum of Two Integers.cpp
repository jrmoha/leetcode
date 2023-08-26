class Solution {
public:
    unsigned getSum(unsigned a, unsigned b) {
        return b==0?a:getSum(a^b,(a&b)<<1);}
};