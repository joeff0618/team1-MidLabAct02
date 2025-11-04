package solutions.hash_map;

import solutions.Solution;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar implements Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> charCounter = new HashMap<Character, Integer>();
        int upperLim = s.length();
        int newHigh = 0;

        for(int i = 0; i < upperLim; i++){
            int currHigh = 0;
            for(int j = i; j < upperLim; j++){
                if(!charCounter.containsKey(s.charAt(j))){
                    currHigh++;
                    charCounter.put(s.charAt(j), 1);
                } else {
                    break;
                }
            }
            if(newHigh < currHigh){
                newHigh = currHigh;
            }
            charCounter.clear();
        }

        return newHigh;

    }

    @Override
    public void run() {
        String[] testCases = {
                "abcabcbb",
                "bbbbb",
                "pwwkew",
                "",
                "abcdef",
                "abba",
                "dvdf",
                "tmmzuxt"
        };

        for (String s : testCases) {
            int result = lengthOfLongestSubstring(s);
            System.out.println("Input: \"" + s + "\"");
            System.out.println("Length of longest substring without repeating characters: " + result);
            System.out.println("---------------------------");
        }
    }
}
