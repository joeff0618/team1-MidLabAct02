package solutions.hash_map;

import solutions.Solution;

import java.util.Arrays;
import java.util.HashMap;

/**
 * The {@code TwoSum} class finds two numbers in an array that add up to a target value.
 * <p>
 * Link: <a href="https://leetcode.com/problems/two-sum/description">
 * https://leetcode.com/problems/two-sum/description</a>
 */
public class TwoSum implements Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] result = new int [2];
        for (int i = 0; i <nums.length; i++)
        {
            if (map.containsKey(target - nums[i])){
                result [0] = i;
                result [1] =  map.get(target - nums[i]);

            }
            map.put(nums[i],i);
        }
        return result;
    }

    @Override
    public void run() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Input: [2, 7, 11, 15], Target: 9");
        System.out.println("Output: " + Arrays.toString(twoSum(nums, target)));
    }
}
