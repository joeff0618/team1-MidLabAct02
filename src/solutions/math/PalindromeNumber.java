package solutions.math;

import solutions.Solution;

public class PalindromeNumber implements Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0 )){
            return false;
        }
        int revNumber = 0;

        while (x > revNumber ){
            revNumber = revNumber * 10 + x % 10;
            x /= 10;

        }
        return x == revNumber || x == revNumber / 10;

    }

    @Override
    public void run() {
        int[] testCases = {121, -121, 10, 0, 1221, 12321, 1001, 1234321, 12345};

        for (int num : testCases) {
            boolean result = isPalindrome(num);
            System.out.println("Input: " + num);
            System.out.println("Is Palindrome? " + result);
            System.out.println("---------------------------");
        }
    }
}
