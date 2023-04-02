class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        int size = flowerbed.length;
        for (int i = 0; i < size && cnt < n; i++) {
            if (flowerbed[i] == 0) {
                int nxt=i+1<size?flowerbed[i+1]:flowerbed[i];
                int prv=i-1>=0?flowerbed[i-1]:flowerbed[i];
                if(nxt==0&&prv==0){
                    cnt++;
                    flowerbed[i]=1;
                }
            }
        }
        return cnt == n;
    }
}
