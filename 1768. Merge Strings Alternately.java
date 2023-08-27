class Solution {
    public String mergeAlternately(String a, String b) {
        int i=0,j=0;StringBuilder str = new StringBuilder();
        while(i<a.length()||j<b.length()){
            if(i<a.length())str.append(a.charAt(i));
            if(j<b.length())str.append(b.charAt(j));
            i++;j++;
        }
        return str.toString();
    }
}