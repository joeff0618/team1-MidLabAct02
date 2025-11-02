package solutions.stack;

import solutions.Solution;

import java.util.Stack;

/**
 * <h1>Valid Parenthesis</h1>
 * <p>Difficulty: <strong>Easy</strong></p>
 * <span>Link: <a href="https://leetcode.com/problems/valid-parentheses/description">https://leetcode.com/problems/valid-parentheses/description</a></span>
 * <br><br>
 * <p>
 *      Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 *      <br>An input string is valid if:
 *
 *      <ol>
 *          <li>Open brackets must be closed by the same type of brackets.</li>
 *          <li>Open brackets must be closed in the correct order.</li>
 *          <li>Every close bracket has a corresponding open bracket of the same type.</li>
 *      </ol>
 * </p>
 * <br><br>
 * <pre>{@code
 *      Example 1:
 *      Input: s = "()"
 *      Output: true
 * }</pre>
 * <pre>{@code
 *      Example 2:
 *      Input: s = "()[]{}"
 *      Output: true
 * }</pre>
 * <pre>{@code
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * }</pre>
 * <pre>{@code
 * Example 4:
 * Input: s = "([])"
 * Output: true
 * }</pre>
 * <pre>{@code
 * Example 5:
 * Input: s = "([)]"
 * Output: false
 * }</pre>
 * <br><br>
 * <pre>{@code
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 * }</pre>
 *
 */
public class ValidParenthesis implements Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();


        for(char c : s.toCharArray()){
            if(c == '(') stack.push(')');
            else if(c == '{') stack.push('}');
            else if(c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

    @Override
    public void run() {
        String[] tests = {
                "()",
                "()[]{}",
                "(]",
                "([)]",
                "{[]}"
        };

        for (String test : tests) {
            System.out.println(test + " -> " + isValid(test));
        }
    }
}
