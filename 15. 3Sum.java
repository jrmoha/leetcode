class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int target = 0;
        int i = 0;
        int n = nums.length;
        while (i < n - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (k > j && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    j++;
                    k--;
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
            i++;
        }
        return ans;
    }
}