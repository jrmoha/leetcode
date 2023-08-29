var threeSumClosest = function (nums, target) {
    nums.sort((a, b) => a - b);
    let n = nums.length;
    let closest = nums[0] + nums[1] + nums[2];
    let i = 0;
    while (i < n) {
        let j = i + 1, k = n - 1;
        while (j < k) {
            let sum = nums[i] + nums[j] + nums[k];
            if (Math.abs(target - sum) < Math.abs(target - closest)) {
                closest = sum;
            }
            if (sum === target) return sum;
            else if (sum > target) k--;
            else j++;
        }
        i++;
    }
    return closest;
};