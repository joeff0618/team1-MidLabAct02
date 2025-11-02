package solutions.array;

import solutions.Solution;

import java.util.ArrayList;
import java.util.List;


/**
 * TODO
 * Link: https://leetcode.com/problems/pascals-triangle/description
 */
public class PascalTriangle implements Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> pascalTriangle = new ArrayList<>();


        //Always list 1 at the first row
        pascalTriangle.add(List.of(1));


        // Build each subsequent row starting from the second row
        for(int rowIndex = 0; rowIndex < numRows - 1; rowIndex++){
            //Create a list to store the current row
            List<Integer> currentRow = new ArrayList<>();


            //The first element of every row is always 1
            currentRow.add(1);


            // Get the previous row to calculate values for the current row
            List<Integer> previousRow = pascalTriangle.get(rowIndex);


            // For each position in the middle of row,
            // the value is the sum of the two numbers directly above it
            for(int colIndex = 1 ; colIndex < previousRow.size(); colIndex++){
                int sum = previousRow.get(colIndex -1) + previousRow.get(colIndex);
                currentRow.add(sum);
            }


            //The last element of every row is always 1
            currentRow.add(1);


            // Add all completed row to the Pascal's Triangle list
            pascalTriangle.add(currentRow);
        }


        // Rerturn the entire Pascal's Triangle
        return pascalTriangle;
    }

    @Override
    public void run() {
        // Example test case
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);

        System.out.println("Pascal's Triangle with " + numRows + " rows:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
