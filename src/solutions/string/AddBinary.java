package solutions.string;

import solutions.Solution;

public class AddBinary implements Solution {
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length()-1;
        int j = b.length() -1;

        while(i >= 0 || j>=0|| carry == 1){
            if(i>=0){
                carry += a.charAt(i--) - '0';
            }
            if(j>=0){
                carry += b.charAt(j--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();

    }

    @Override
    public void run() {
        String[][] testCases = {
                {"11", "1"},
                {"1010", "1011"},
                {"0", "0"},
                {"1111", "1"},
                {"100", "110010"},
                {"101010", "1111"}
        };

        for (String[] pair : testCases) {
            String a = pair[0];
            String b = pair[1];
            String result = addBinary(a, b);
            System.out.println("Input A: " + a);
            System.out.println("Input B: " + b);
            System.out.println("Sum: " + result);
            System.out.println("---------------------------");
        }
    }
}
