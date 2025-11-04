package solutions.array;

import solutions.Solution;

public class ContainerWithMostWater implements Solution {
    public int maxArea(int[] height) {

        int left = 0, right = height.length - 1;
        int high = 0;

        while(left < right){
            int len = right - left;
            int h = Math.min(height[left], height[right]);
            int result = h * len;
            high = Math.max(high, result);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }

        return high;

    }

    @Override
    public void run() {
        int[][] testCases = {
                {1,8,6,2,5,4,8,3,7},
                {1,1},
                {4,3,2,1,4},
                {1,2,1},
                {2,3,10,5,7,8,9}
        };

        for (int[] heights : testCases) {
            int result = maxArea(heights);
            System.out.print("Input heights: [");
            for (int i = 0; i < heights.length; i++) {
                System.out.print(heights[i]);
                if (i < heights.length - 1) System.out.print(", ");
            }
            System.out.println("]");
            System.out.println("Maximum area of water container: " + result);
            System.out.println("---------------------------");
        }
    }
}
