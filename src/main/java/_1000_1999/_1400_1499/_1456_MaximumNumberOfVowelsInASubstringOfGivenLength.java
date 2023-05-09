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

        int[] sum = new int[s.length()];

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                counter++;
            }
            sum[i] = counter;
        }

        if (k == 1) {
            if (counter > 0) {
                ans = 1;
            }
            return ans;
        }

        for (int i = 0; i <= sum.length - k; i++) {
            int vSum;
            if (i == 0) {
                vSum = sum[i + k - 1];
            } else {
                vSum = sum[i + k - 1] - sum[i - 1];
            }


            if (vSum == k) {
                ans = vSum;
                break;
            }
            if (vSum > ans) {
                ans = vSum;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(maxVowels("weallloveyou", 7));
    }
}
