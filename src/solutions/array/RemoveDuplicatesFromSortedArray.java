package solutions.array;

import solutions.Solution;

/**
 * TODO
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description
 */
public class RemoveDuplicatesFromSortedArray implements Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;


        for(int j = 1 ; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    @Override
    public void run() {
        // Example test case
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.print("Original array: ");
        printArray(nums);

        int newLength = removeDuplicates(nums);

        System.out.println("\nAfter removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nNew length: " + newLength);
    }

    private void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
