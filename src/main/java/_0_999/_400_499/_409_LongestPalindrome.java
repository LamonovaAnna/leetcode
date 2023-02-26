package _0_999._400_499;

// 409. Longest Palindrome
public class _409_LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] letters = new int[58];
        int counter = 0;
        boolean single = false;

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'A']++;
        }

        for (int letter : letters) {
            if (letter != 0) {
                if (letter % 2 == 0) {
                    counter += letter;
                } else if (letter > 1) {
                    counter += letter - 1;
                    single = true;
                } else {
                    single = true;
                }
            }
        }

        if (single) {
            counter += 1;
        }

        return counter;
    }

    public void solution() {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("aaaAaaaa"));
        System.out.println(longestPalindrome("ccc"));
    }
}
