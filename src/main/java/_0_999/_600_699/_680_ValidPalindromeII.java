package _0_999._600_699;

//680. Valid Palindrome II
public class _680_ValidPalindromeII {
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (sb.charAt(i) != sb.charAt(j)) {
                char removed = sb.charAt(i);
                sb.deleteCharAt(i);
                if (sb.toString().equals(sb.reverse().toString())) {
                    return true;
                }
                sb.reverse();
                sb.insert(i, removed);
                sb.deleteCharAt(j);
                if (!sb.toString().equals(sb.reverse().toString())) {
                    return false;
                } else {
                    break;
                }
            }
        }
        return true;
    }

    public void solution() {
        System.out.println(validPalindrome("tebbem"));
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("ebcbbececabbacecbbcbe"));
        System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));

        System.out.println(validPalindrome("abca"));



        System.out.println(validPalindrome("abc"));




    }
}
