package string.logical;

import java.util.HashMap;

public class LongestWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";

        System.out.println("Longest substring without repeating character in s1 : " + lengthOfLongestSubstring(s1));
        System.out.println("Longest substring without repeating character in s2 : " + lengthOfLongestSubstring(s2));
        System.out.println("Longest substring without repeating character in s3 : " + lengthOfLongestSubstring(s3));
        System.out.println("Longest substring without repeating character in s4 : " + lengthOfLongestSubstring(s4));
    }

    private static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (map.containsKey(currentChar)) {
                // Move the start pointer to the right of the last occurrence of currentChar
                start = Math.max(start, map.get(currentChar) + 1);
            }
            // Update the last index of the current character
            map.put(currentChar, end);
            // Calculate the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}