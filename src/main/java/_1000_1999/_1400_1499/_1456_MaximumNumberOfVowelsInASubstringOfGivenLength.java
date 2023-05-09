package _1000_1999._1400_1499;

import java.util.HashSet;

// 1456. Maximum Number of Vowels in a Substring of Given Length
public class _1456_MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int ans = 0;

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int start = 0;

        while (start + k <= s.length()) {
            int temp = 0;
            for (int i = start; i < start + k; i++) {
                if (vowels.contains(s.charAt(i))) {
                    temp++;
                }
            }

            if (temp > ans) {
                ans = temp;
            }
            if (ans == k) {
                break;
            }
            if (temp == 0 && k > 2) {
                start += k - 1;
            } else {
                start++;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(maxVowels("tryhard", 4));
    }
}
