class NumArray {

   private final int[] nums;
        private final int[] sum;

        public NumArray(int[] nums) {
            this.nums = nums;
            this.sum = new int[nums.length];
            this.sum[0] = this.nums[0];
            for (int i = 1; i < nums.length; i++) {
                this.sum[i] = this.sum[i - 1] + this.nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return this.sum[right] - (left > 0 ? this.sum[left - 1] : 0);
        }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */