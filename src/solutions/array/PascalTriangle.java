package solutions.array;

import solutions.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * The {@code PascalTriangle} class generates Pascal's Triangle up to a given number of rows.
 * <p>
 * Each row in Pascal's Triangle represents the coefficients of binomial expansion.
 * For example:
 * <pre>
 * Row 1: [1]
 * Row 2: [1, 1]
 * Row 3: [1, 2, 1]
 * Row 4: [1, 3, 3, 1]
 * Row 5: [1, 4, 6, 4, 1]
 * </pre>
 * <p>
 * This class implements the {@link solutions.Solution} interface, which requires a {@code run()} method
 * to demonstrate the functionality.
 *
 * <p><b>Problem Link:</b>
 * <a href="https://leetcode.com/problems/pascals-triangle/description">
 * https://leetcode.com/problems/pascals-triangle/description</a>
 *
 */

public class PascalTriangle implements Solution {/**
     * Generates Pascal's Triangle up to the specified number of rows.
     *
     * @param numRows the number of rows to generate; must be greater than 0
     * @return a list of lists representing Pascal's Triangle, where each inner list is a row
     */
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> pascalTriangle = new ArrayList<>();


        //Always list 1 at the first row
        pascalTriangle.add(Arrays.asList(1));


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
    /**
     * Demonstrates the {@link #generate(int)} method by printing
     * Pascal's Triangle with a fixed number of rows.
     * <p>
     * Example output:
     * <pre>
     * Pascal's Triangle with 5 rows:
     * [1]
     * [1, 1]
     * [1, 2, 1]
     * [1, 3, 3, 1]
     * [1, 4, 6, 4, 1]
     * </pre>
     */
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
