package solutions.bit;

import solutions.Solution;

public class PowerOfTwo implements Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0; // binary conversion
    }

    @Override
    public void run() {
        int[] testCases = {0, 1, 2, 3, 4, 8, 16, 18, 32, 64, 127, 128, 256, 1024, -2};

        for (int n : testCases) {
            boolean result = isPowerOfTwo(n);
            System.out.println("Input: " + n + " (binary: " + Integer.toBinaryString(n) + ")");
            System.out.println("Is Power of Two? " + result);
            System.out.println("---------------------------");
        }
    }
}
