package _0_999._300_399;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//345. Reverse Vowels of a String
public class _345_ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'u', 'i', 'o', 'A', 'E', 'U', 'I', 'O'));
        StringBuilder sb = new StringBuilder();

        for (int i = letters.length - 1; i >= 0; i--) {
            if (vowels.contains(letters[i])) {
                sb.append(letters[i]);
            }
        }

        StringBuilder ans = new StringBuilder();
        int ind = 0;
        for (char letter : letters) {
            if (vowels.contains(letter)) {
                ans.append(sb.charAt(ind));
                ind++;
            } else {
                ans.append(letter);
            }
        }

        return ans.toString();
    }

    public void solution() {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
    }
}
