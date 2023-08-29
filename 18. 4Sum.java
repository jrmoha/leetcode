class Solution {
    public  List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum - nums[i] - nums[j] - nums[k] - nums[l] != 0) {
                        if (sum > target) {
                            l--;
                        } else {
                            k++;
                        }
                        continue;
                    }
                    if (sum == target) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        while (k < l && nums[k] < target - nums[i] - nums[j] - nums[l]) k++;
                        while (k < l && nums[l] > target - nums[i] - nums[j] - nums[k]) l--;
                        k++;
                        l--;
                    } else if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}