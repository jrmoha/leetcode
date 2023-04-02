class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int n = a.length();
        int m = b.length();
        int dp[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    if (i > 0 && j > 0) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = 1;
                    }
                }else{
                    if(i==0&&j==0)dp[i][j]=0;
                    else if(i>0&&j==0)dp[i][j]=dp[i-1][j];
                    else if(i==0&&j>0)dp[i][j]=dp[i][j-1];
                    else dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n-1][m-1];
    }
}