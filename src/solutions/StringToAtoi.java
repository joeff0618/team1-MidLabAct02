package solutions;

public class StringToAtoi implements Solution {
    public int myAtoi(String s) {
        char[] arr = s.trim().toCharArray();
        int n = arr.length;
        if (n == 0) return 0;

        int result = 0;
        boolean isNegative = false;

        for (int i = 0; i < n; i++) {
            char c = arr[i];

            if (i == 0 && (c == '-' || c == '+')) {
                isNegative = (c == '-');
                continue;
            }

            if (c < '0' || c > '9') break;

            int digit = c - '0';

            // Handle int overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
        }

        return isNegative ? -result : result;
    }
    @Override
    public void run() {
        // Sample test cases for the myAtoi method
        String[] testStrings = {
                "42",
                "   -42",
                "4193 with words",
                "words and 987",
                "-91283472332",
                "+123",
                "  +0 123",
                "2147483648",  // Overflow
                "-2147483649"  // Underflow
        };

        // Display results for each test case
        for (String s : testStrings) {
            int result = myAtoi(s);
            System.out.println("Input: \"" + s + "\"");
            System.out.println("Output: " + result);
            System.out.println("---------------------------");
        }
    }
}
