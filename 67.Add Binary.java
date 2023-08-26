class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        int base = 48;
        int sum;
        while (i >= 0 || j >= 0 || carry == 1) {
            sum=carry;
            if(i>=0)sum+=a.charAt(i)-base;
            if(j>=0)sum+=b.charAt(j)-base;
            carry=sum/2;
            res.append(sum%2);
            i--;j--;
        }
        return res.reverse().toString();
    }
}
