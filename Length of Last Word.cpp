class Solution {
public:
    int lengthOfLastWord(string s) {
        for(int i=s.length()-1;i>=0&&s[i]==' ';i--)s.erase(i,1);
        int i=s.length()-1;int cnt=0;
        while(i>=0&&s[i]!=' '){cnt++;i--;}
        return cnt;
    }
};