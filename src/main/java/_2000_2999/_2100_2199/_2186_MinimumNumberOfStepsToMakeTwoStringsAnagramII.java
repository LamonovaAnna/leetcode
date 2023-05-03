package _2000_2999._2100_2199;

import java.util.Arrays;

// 2186. Minimum Number of Steps to Make Two Strings Anagram II
public class _2186_MinimumNumberOfStepsToMakeTwoStringsAnagramII {
    public int minSteps(String s, String t) {
        int steps = 0;

        int[] alphaS = new int[26];
        int[] alphaT = new int[26];

        for (char c : s.toCharArray()) {
            alphaS[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            alphaT[c - 'a']++;
        }

        if (Arrays.equals(alphaS, alphaT)) {
            return steps;
        }

        for (int i = 0; i < alphaS.length; i++) {
            if (alphaS[i] != alphaT[i]) {
                steps += Math.abs(alphaS[i] - alphaT[i]);
            }
        }

        return steps;
    }

    public void solution() {
        System.out.println(minSteps("leetcode", "coats"));
    }
}
