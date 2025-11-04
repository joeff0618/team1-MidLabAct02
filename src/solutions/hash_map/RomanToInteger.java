package solutions.hash_map;

import solutions.Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code RomanToInteger} class converts a Roman numeral string into an integer.
 * <p>
 * Link: <a href="https://leetcode.com/problems/roman-to-integer/description">
 * https://leetcode.com/problems/roman-to-integer/description</a>
 */
public class RomanToInteger implements Solution {

    public int romanToInt(String s) {

        int x = 0, y = 0;

        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for(int j = 0; j <= s.length()-1; j++)
        {
            if((s.length() - j) == 1)
            {
                x = m.get(s.charAt(j)) + x;
            }
            else
            {
                if(m.get(s.charAt(j)) >= m.get(s.charAt(j+1)))
                {
                    x = x + m.get(s.charAt(j));
                }
                else
                {
                    x = x - m.get(s.charAt(j));
                }
            }
        }

        return x;
    }


    @Override
    public void run() {
        String[] examples = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
        for (String roman : examples) {
            System.out.println(roman + " -> " + romanToInt(roman));
        }
    }
}
