package _1000_1999._1300_1399;

// 1347. Minimum Number of Steps to Make Two Strings Anagram
public class _1347_MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public int minSteps(String s, String t) {
        int ans = 0;
        int[] alphabetT = new int[26];
        int[] alphabetS = new int[26];

        for (int i = 0; i < t.length(); i++) {
            alphabetT[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            alphabetS[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (alphabetT[i] < alphabetS[i]) {
                ans += alphabetS[i] - alphabetT[i];
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(minSteps("leetcode", "practice"));
    }
}
