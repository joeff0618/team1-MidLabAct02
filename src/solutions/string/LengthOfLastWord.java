package solutions.string;

import solutions.Solution;

public class LengthOfLastWord implements Solution {
    public int lengthOfLastWord(String s) {
        int endIndex = s.length() -1;

        while(endIndex >= 0 && s.charAt(endIndex) == ' '){
            endIndex--;
        }

        int startIndex = endIndex;

        while(startIndex >= 0 && s.charAt(startIndex) != ' '){
            startIndex--;
        }
        return endIndex - startIndex;
    }

    @Override
    public void run() {
        // Example test cases
        String[] testStrings = {
                "Hello World",
                "   fly me   to   the moon  ",
                "luffy is still joyboy",
                "a",
                "day ",
                "   "
        };

        // Display the results
        for (String s : testStrings) {
            int length = lengthOfLastWord(s);
            System.out.println("Input: \"" + s + "\"");
            System.out.println("Length of last word: " + length);
            System.out.println("---------------------------");
        }
    }
}
