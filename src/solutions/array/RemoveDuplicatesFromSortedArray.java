package solutions.array;

import solutions.Solution;

/**
 * Solution for the "Remove Duplicates from Sorted Array" problem.
 * <p>
 * This class removes duplicate elements from a sorted integer array in-place.
 * After processing, the array will contain only unique elements at the beginning,
 * and the method will return the count of these unique elements.
 * </p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 * Input:  nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: new length = 5
 * Modified array = [0,1,2,3,4,...]
 * </pre>
 *
 * <p><b>Problem Link:</b> <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description">
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description</a></p>
 */
public class RemoveDuplicatesFromSortedArray implements Solution {
    /**
     * Removes duplicate values from a sorted integer array.
     * <p>
     * The function modifies the input array in-place such that
     * the first part of the array contains only unique values.
     * </p>
     *
     * @param nums the sorted array of integers
     * @return the number of unique elements in the array
     */
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

    /**
     * Runs a sample test case demonstrating the
     * {@link #removeDuplicates(int[])} method.
     */
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

    /**
     * Utility method to print all elements in an array.
     *
     * @param arr the array to print
     */
    private void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
