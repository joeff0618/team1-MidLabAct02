package solutions.bit;

import solutions.Solution;

public class HammingWeight implements Solution {
    int hammingWeight(int n) {
        int result = 0;

        while (n > 0) {
            n = n & (n - 1);
            result++;
        }
        return result;
    }

    @Override
    public void run() {
        int[] testCases = {0, 1, 2, 3, 5, 11, 128, 255, 1023};

        for (int n : testCases) {
            int bits = hammingWeight(n);
            System.out.println("Input: " + n + " (binary: " + Integer.toBinaryString(n) + ")");
            System.out.println("Number of 1 bits: " + bits);
            System.out.println("---------------------------");
        }
    }
}
