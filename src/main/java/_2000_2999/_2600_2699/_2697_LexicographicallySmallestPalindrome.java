package _2000_2999._2600_2699;

// 2697. Lexicographically Smallest Palindrome
public class _2697_LexicographicallySmallestPalindrome {
    public String makeSmallestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] chars = s.toCharArray();

        int stop = chars.length / 2;

        for (int i = 0; i < stop; i++) {
            if (chars[i] != chars[s.length() - 1 - i] && chars[i] > chars[s.length() - 1 - i]) {
                chars[i] = chars[s.length() - 1 - i];
            } else {
                chars[s.length() - 1 - i] = chars[i];
            }
        }

        return new String(chars);
    }

    public void solution() {
        System.out.println(makeSmallestPalindrome("abcd"));
    }
}
