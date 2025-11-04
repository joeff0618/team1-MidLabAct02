package solutions.string;

import solutions.Solution;

public class IntegerToRoman implements Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


        int val = num;
        String result = "";

        for (int i = 0; i < values.length && num > 0; i++) {
            int remainder = val % values[i];

            if (remainder == val) {
                continue;
            }

            int temp = val - remainder;
            int numOfChar = temp / values[i];

            for (int j = 0; j < numOfChar; j++) {
                result += symbols[i];
            }
            val = remainder;
        }

        return result;
    }


    @Override
    public void run() {
        int[] testCases = {1, 3, 4, 9, 58, 1994, 2024, 3999};

        for (int num : testCases) {
            String roman = intToRoman(num);
            System.out.println("Input: " + num);
            System.out.println("Roman Numeral: " + roman);
            System.out.println("---------------------------");
        }
    }
}
