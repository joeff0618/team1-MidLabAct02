package main;

import solutions.Solution;
import solutions.array.PascalTriangle;
import solutions.array.RemoveDuplicatesFromSortedArray;
import solutions.stack.ValidParenthesis;

public class Main {
    public static void main(String[] args) {
        Solution[] solutions = {
           new PascalTriangle(),
           new RemoveDuplicatesFromSortedArray(),
           new ValidParenthesis()
        };

        for (Solution s : solutions) {
            s.run();
        }
    }
}
