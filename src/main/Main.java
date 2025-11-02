package main;
import solutions.array.PascalTriangle;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();

        // Example: generate 5 rows
        int numRows = 5;
        List<List<Integer>> triangle = pt.generate(numRows);

        System.out.println("Pascal's Triangle with " + numRows + " rows:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }        
    }
}
