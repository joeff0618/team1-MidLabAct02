package solutions.linked_list;

import solutions.Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code GenerateParenthesis} class generates all combinations
 * of well-formed parentheses for a given number of pairs.
 * <p>
 * Link: <a href="https://leetcode.com/problems/generate-parentheses/description">
 * https://leetcode.com/problems/generate-parentheses/description</a>
 */
public class GenerateParenthesis implements Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }

    }

    @Override
    public void run() {
        int n = 3;
        System.out.println("Generate Parentheses for n = " + n);
        System.out.println(generateParenthesis(n));
    }
}
