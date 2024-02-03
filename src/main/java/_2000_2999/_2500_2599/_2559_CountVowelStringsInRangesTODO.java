package _2000_2999._2500_2599;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 2559. Count Vowel Strings in Ranges
public class _2559_CountVowelStringsInRangesTODO {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Map<Character, Integer> vowels = new HashMap<>();
        vowels.put('a', 0);
        vowels.put('e', 0);
        vowels.put('i', 0);
        vowels.put('o', 0);
        vowels.put('u', 0);

        if (words.length == 1) {
            int[] ans = new int[queries.length];
            if (vowels.containsKey(words[0].charAt(0)) && vowels.containsKey(words[0].charAt(words[0].length() - 1))) {
                Arrays.fill(ans, 1);
            }
            return ans;
        }
        
        int[] containVowel = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 1) {
                if (vowels.containsKey(word.charAt(0)) && vowels.containsKey(word.charAt(word.length() - 1))) {
                    containVowel[i]++;
                }
            } else {
                if (vowels.containsKey(word.charAt(0))) {
                    containVowel[i]++;
                }
            }
        }
        
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                ans[i] += containVowel[j];
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(vowelStrings(
                new String[]{"aba", "bcb", "ece", "aa", "e"}, new int[][]{{0, 2}, {1, 4}, {1, 1}}))); // [2,3,0]
    }
}
