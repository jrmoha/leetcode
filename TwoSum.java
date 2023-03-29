import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] soln = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Object val=map.get(target - nums[i]);
            if (val != null&&!val.equals(i)) {
                soln[0] = i;
                soln[1] = map.get(target - nums[i]);
                break;
            }
        }
        return soln;
    }
}