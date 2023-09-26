class Solution {
    public int minDeletions(String str) {
        int[] freq = new int[26];
        boolean exists[]=new boolean[str.length()+1];
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            ++freq[str.charAt(i) - 'a'];
        }
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0&&exists[freq[i]]){
                freq[i]--;
                cnt++;
            }
            if(freq[i]>0){
                exists[freq[i]]=true;
            }
        }
        return cnt; 
    }
}