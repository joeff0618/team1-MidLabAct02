package main;

import solutions.array.NQueens2;
import solutions.string.IntegerToRoman;
import solutions.string.LengthOfLastWord;
import solutions.Solution;
import solutions.string.StringToAtoi;
import solutions.array.PascalTriangle;
import solutions.array.RemoveDuplicatesFromSortedArray;
import solutions.stack.ValidParenthesis;

public class Main {
    public static void main(String[] args) {
        Solution[] solutions = {
           new PascalTriangle(),
           new RemoveDuplicatesFromSortedArray(),
           new ValidParenthesis(),
           new LengthOfLastWord(),
           new StringToAtoi(),
           new NQueens2(),
           new IntegerToRoman()
        };

        for (Solution s : solutions) {
            s.run();
        }
    }
}
