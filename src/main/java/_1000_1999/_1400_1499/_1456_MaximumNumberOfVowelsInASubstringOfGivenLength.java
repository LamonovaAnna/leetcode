package _1000_1999._1400_1499;

// 1456. Maximum Number of Vowels in a Substring of Given Length
public class _1456_MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int maxVowels;
        int count = 0;

        int[] vowels = new int[26];
        vowels['a' - 'a']++;
        vowels['e' - 'a']++;
        vowels['i' - 'a']++;
        vowels['o' - 'a']++;
        vowels['u' - 'a']++;

        for (int i = 0; i < k; i++) {
            count += vowels[s.charAt(i) - 'a'];
        }

        maxVowels = count;
        for (int i = k; i < s.length(); i++) {
            count += vowels[s.charAt(i) - 'a'] - vowels[s.charAt(i - k) - 'a'];
            maxVowels = Math.max(maxVowels, count);
            if (maxVowels == k) {
                return maxVowels;
            }
        }
        return maxVowels;
    }

    public void solution() {
        System.out.println(maxVowels("abciidef", 3));
    }
}
