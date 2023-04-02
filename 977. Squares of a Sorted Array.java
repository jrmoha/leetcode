class Solution {
    public int[] sortedSquares(int[] a) {
       int n = a.length;
        int[] p = new int[n];
        int i = 0, j = n - 1;
        for (int k = n-1; k >=0; k--) {
            if (Math.abs(a[i]) < Math.abs(a[j])) {
                p[k] = a[j] * a[j];j--;
            } else {
                p[k]=a[i]*a[i];i++;
            }

        }
        //System.out.println(Arrays.toString(p));
        return p;
    }
}