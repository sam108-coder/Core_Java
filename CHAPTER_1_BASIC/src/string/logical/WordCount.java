package string.logical;

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        wordCount("Test Automation Java Automation");
    }

    private static void wordCount(String inputString) {
        HashMap<String, Integer> charCountMap = new HashMap<>();
        for (String s : inputString.split(" ")) {
            if (charCountMap.containsKey(s)) {
                charCountMap.put(s, charCountMap.get(s) + 1);
            } else {
                charCountMap.put(s, 1);
            }
        }
        System.out.println("Count of character in a given string : " + charCountMap);
    }

}
