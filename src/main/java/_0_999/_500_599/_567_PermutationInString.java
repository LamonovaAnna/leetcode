package _0_999._500_599;

import java.util.Arrays;

// 567. Permutation in String
public class _567_PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        int[] s1letters = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1letters[s1.charAt(i) - 'a']++;
        }

        int i = 0;
        int j = 0;
        int[] s2letters = new int[26];

        while (i < s2.length()) {
            while (i - j < s1.length()) {
                s2letters[s2.charAt(i) - 'a']++;
                i++;
            }
            if (!Arrays.equals(s1letters, s2letters)) {
                s2letters[s2.charAt(j) - 'a']--;
                j++;
            } else {
                return true;
            }
        }
        return false;
    }

    public void solution() {
        System.out.println(checkInclusion("ab", "eidbaooo"));
        System.out.println(checkInclusion("ab", "eidboaooo"));
    }
}
