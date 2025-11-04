package main;

import solutions.Solution;

import solutions.array.*;
import solutions.stack.*;
import solutions.hash_map.*;
import solutions.linked_list.*;

public class Main {
    public static void main(String[] args) {
        Solution[] solutions = {
                // Array
                new PascalTriangle(),
                new RemoveDuplicatesFromSortedArray(),

                // Stack
                new ValidParenthesis(),

                // Hash Map
                new RomanToInteger(),
                new SingleNumber(),
                new TwoSum(),

                // Linked List
                new AddTwoNumbers(),
                new GenerateParenthesis(),
                new MergeTwoSortedLists(),
                new ReverseKGroup()
        };

        for (Solution s : solutions) {
            System.out.println("Running: " + s.getClass().getSimpleName());
            s.run();
            System.out.println("--------------------------------------------------");
        }
    }
}