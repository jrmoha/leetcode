class Solution {
public:
    bool isPalindrome(string s) {
        for(int i=0;i<s.length();i++){
            if(s[i]>=65&&s[i]<=90)s[i]+=32;
            else if(!((s[i]>=97&&s[i]<=122)||(s[i]>='0'&&s[i]<='9'))){
                s.erase(i,1);
                i--;
            }
        }
        int left=0,right=s.length()-1;
        while(left<=right){
            if(s[left]!=s[right])return false;
            left++;
            right--;
        }
        return true;
    }
};