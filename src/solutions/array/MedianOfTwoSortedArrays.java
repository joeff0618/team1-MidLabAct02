package solutions.array;

import solutions.Solution;

import java.util.Arrays;

/**
 * The {@code MedianOfTwoSortedArrays} class finds the median of two sorted arrays.
 * <p>
 * Link: <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/description">
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description</a>
 */
public class MedianOfTwoSortedArrays implements Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];

        System.arraycopy(nums1,0,merged,0,nums1.length);
        System.arraycopy(nums2,0,merged, nums1.length, nums2.length);

        Arrays.sort(merged);

        int length = merged.length;

        if(length % 2 == 0){

            System.out.println(merged[length / 2]);
            System.out.println(merged[length/2 - 1]);

            return (merged[length / 2] + merged[length/2 - 1]) / 2.0;
        } else {
            return merged[length / 2];
        }

    }


    @Override
    public void run() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("nums1 = [1, 3], nums2 = [2]");
        System.out.println("Median: " + findMedianSortedArrays(nums1, nums2));
    }
}
