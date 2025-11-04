package solutions.array;

import solutions.Solution;

/**
 * The {@code SingleNumberII} class finds the unique element in an array
 * where every other element appears more than once.
 * <p>
 * Link: <a href="https://leetcode.com/problems/single-number/description">
 * https://leetcode.com/problems/single-number/description</a>
 */
public class SingleNumberII implements Solution {

    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            // Compare arrray with other numbers
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    // break look if number has duplicate
                    break;
                }
            }
            if (isUnique) {
                // Return the unique number that is not repeated
                return nums[i];
            }
        }
        // return -1 if no
        return -1;
    }

    @Override
    public void run() {
        int[] nums = {2, 2, 1};
        System.out.println("Input: [2, 2, 1]");
        System.out.println("Single Number: " + singleNumber(nums));
    }
}
