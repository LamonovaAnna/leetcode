package _0_999._300_399;

import java.util.Arrays;

//345. Reverse Vowels of a String
public class _345_ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        String[] letters = s.split("");
        String vowels = "aeuioAEUIO";
        int rightIndex = letters.length;
        String leftVowel;


        for (int i = 0; i < letters.length; i++) {
            if (i >= rightIndex) {
                break;
            }
            if (vowels.contains(letters[i])) {
                leftVowel = letters[i];
                for (int j = rightIndex - 1; j > i; j--) {
                    if (vowels.contains(letters[j])) {
                        rightIndex = j;
                        letters[i] = letters[j];
                        letters[j] = leftVowel;
                        break;
                    }
                }
            }
        }
        return String.join("", letters);
    }

    public void solution() {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
    }
}
