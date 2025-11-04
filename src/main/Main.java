package main;

import solutions.Solution;

import solutions.array.*;
import solutions.bit.*;
import solutions.math.*;
import solutions.stack.*;
import solutions.hash_map.*;
import solutions.linked_list.*;
import solutions.string.*;
import solutions.tree.*;

public class Main {
    public static void main(String[] args) {
        Solution[] solutions = {
                // Array
                new PascalTriangle(),
                new RemoveDuplicatesFromSortedArray(),
                new MaxProfit(),
                new MedianOfTwoSortedArrays(),
                new SingleNumberII(),
                new ContainerWithMostWater(),
                new NQueens2(),

                // Bit
                new HammingWeight(),
                new PowerOfTwo(),

                // Hash Map
                new RomanToInteger(),
                new SingleNumber(),
                new TwoSum(),

                // Linked List
                new AddTwoNumbers(),
                new GenerateParenthesis(),
                new MergeTwoSortedLists(),
                new ReverseKGroup(),

                // Math
                new PalindromeNumber(),

                // Stack
                new ValidParenthesis(),

                // String
                new AddBinary(),
                new IntegerToRoman(),
                new LengthOfLastWord(),
                new StringToAtoi(),

                // Tree
                new BalancedBinaryTree(),
        };

        for (Solution s : solutions) {
            System.out.println("Running: " + s.getClass().getSimpleName());
            s.run();
            System.out.println("--------------------------------------------------");
        }
    }
}