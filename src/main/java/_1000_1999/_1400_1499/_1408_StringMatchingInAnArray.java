package _1000_1999._1400_1499;

import java.util.ArrayList;
import java.util.List;

// 1408. String Matching in an Array
public class _1408_StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();

        for (String word : words) {
            boolean found = false;
            for (String s : words) {
                if (found) {
                    break;
                }
                if (!word.equals(s)) {
                    if (word.length() < s.length()) {
                        int start = s.indexOf(word.charAt(0));
                        StringBuilder sb = new StringBuilder(s);
                        while (start > -1) {
                            if (found) {
                                break;
                            }
                            String temp = sb.substring(start);
                            if (temp.length() > word.length()) {
                                temp = temp.substring(0, word.length());
                            } else if (temp.length() < word.length()) {
                                break;
                            }
                            if (temp.equals(word)) {
                                ans.add(word);
                                found = true;
                            }
                            sb.deleteCharAt(start);
                            start = sb.indexOf(String.valueOf(word.charAt(0)));
                        }
                    }
                }
            }

        }
        return ans;
    }

    public void solution() {
        System.out.println(stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
        System.out.println(stringMatching(new String[]{"leetcode", "et", "code"}));
        System.out.println(stringMatching(new String[]{"blue", "green", "bu"}));
    }
}
