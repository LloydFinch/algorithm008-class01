package Week_03;

import java.util.HashMap;

public class TwoSum {
    /**
     * 简单粗暴的遍历
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return null;
    }

    /**
     * 两遍HashMap
     * 
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            // 这里不能是自己，比如[2,4,5] 10，不能是5+5
            if (map.containsKey(result) && map.get(result) != i) {
                return new int[] { i, map.get(result) };
            }
        }

        return null;
    }
}