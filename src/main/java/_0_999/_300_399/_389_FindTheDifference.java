package _0_999._300_399;

//389. Find the Difference
public class _389_FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        char x = 0;
        for (int i = 0; i < t.length(); i++) {
            if (alphabet[t.charAt(i) - 'a'] == 0) {
                return t.charAt(i);
            } else {
                alphabet[t.charAt(i) - 'a']--;
            }
        }
        return x;
    }

    public void solution() {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("", "y"));
        System.out.println(findTheDifference("a", "aa"));
    }
}
